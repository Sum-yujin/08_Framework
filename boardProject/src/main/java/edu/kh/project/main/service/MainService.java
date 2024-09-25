package edu.kh.project.main.service;

import java.util.List;

import edu.kh.project.main.dto.Member;

public interface MainService {

	/** 전체 회원 조회
	 * @return list
	 */
	List<Member> selectMemberList();

}
