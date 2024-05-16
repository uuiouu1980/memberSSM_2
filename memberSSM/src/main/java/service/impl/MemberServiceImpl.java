package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import service.MemberService;
import vo.Member;

public class MemberServiceImpl implements MemberService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static MemberDaoImpl md=new MemberDaoImpl();

	@Override
	public void addMember(Member m) {
		md.add(m);
		
	}

	@Override
	public String showAll() {
		String show="";
		List<Member> l=md.selectAll();
		for(Member m:l)
		{
			show=show+"<tr><td>"+m.getId()+
					"<td>"+m.getName()+
					"<td>"+m.getUsername()+
					"<td>"+m.getPassword();
		}
		
		return show;
	}

}