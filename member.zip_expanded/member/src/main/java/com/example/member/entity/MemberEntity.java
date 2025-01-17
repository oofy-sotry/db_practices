package com.example.member.entity;

import com.example.member.dto.MemberDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "member_table")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String memberEmail;

    @Column
    private String memberPassword;

    @Column
    private String memberName;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDTO.getId());
        memberEntity.setMemberEmail(memberDTO.getMemberEmail());
        memberEntity.setMemberName(memberDTO.getMemberName());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        return memberEntity;
    }

    
	private void setMemberPassword(String memberPassword2) {
		// TODO Auto-generated method stub
	}
	private void setMemberName(String memberName2) {
		// TODO Auto-generated method stub
	}
	private void setMemberEmail(String memberEmail2) {
		// TODO Auto-generated method stub
	}
	private void setId(Long id2) {
		// TODO Auto-generated method stub
	}


	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getMemberEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getMemberName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getMemberPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
