package dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.DbConnection;
import dao.MemberDao;
import vo.Member;

public class MemberDaoImpl implements MemberDao{

	public static void main(String[] args) {
		Member m=new Member("aa","uu","22");
		new MemberDaoImpl().add(m);
	}
	
	private static SqlSession session=DbConnection.getDb();

	@Override
	public void add(Member m) {
		session.insert("addMember", m);
		session.commit();
		
	}

	@Override
	public List<Member> selectAll() {
		List<Member> l=session.selectList("selectAll", Member.class);
		return l;
	}

}