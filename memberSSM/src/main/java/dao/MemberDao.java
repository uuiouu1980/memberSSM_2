package dao;

import java.util.List;

import vo.Member;

public interface MemberDao {
	//create
	void add(Member m);
	//read
	List<Member> selectAll();
	

}