package com.ktuniversity.edu.kjs.bbs.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktuniversity.edu.kjs.bbs.vo.BoardVO;

@Repository
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao {
	@Override
	public List<BoardVO> selectAllBoard() {
		return getSqlSession().selectList("getAllBoard");
	}

	@Override
	public int selectBoardAllCount() {
		return getSqlSession().selectOne("getBoardAllCount");
	}
	
	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
	@Override
	public int getBoardAllCount() {
		return getSqlSession().selectOne("getBoardAllCount");
		
	}
	
	@Override
	public List<BoardVO> getAllBoard() {
		return getSqlSession().selectList("getAllBoard");
	}

	@Override
	public int createNewBoard(BoardVO boardVO) {
		return getSqlSession().insert("createNewBoard", boardVO);
	}

	@Override
	public int increaseViewCount(int id) {
		return getSqlSession().update("increaseViewCount", id);
	}

	@Override
	public BoardVO getOneBoard(int id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("getOneBoard", id);
	}

	@Override
	public int updateOneBoard(BoardVO boardVO) {
		return getSqlSession().update("updateOneBoard", boardVO);
	}

	@Override
	public int deleteOneBoard(int id) {
		return getSqlSession().delete("deleteOneBoard", id);
	}
}	
