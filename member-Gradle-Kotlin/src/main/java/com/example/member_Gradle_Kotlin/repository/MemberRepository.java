package com.example.member_Gradle_Kotlin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.member_Gradle_Kotlin.entity.MemberEntity;


@Repository // 첫번째 인자 : 어떤 Entity인지, 두번째 인자 : pk 어떤 타입인지
public interface MemberRepository extends JpaRepository<MemberEntity, Long>{

}