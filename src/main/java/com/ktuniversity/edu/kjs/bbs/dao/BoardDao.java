package com.ktuniversity.edu.kjs.bbs.dao;

import java.util.List;

import com.ktuniversity.edu.kjs.bbs.vo.BoardVO;


public interface BoardDao {
	public int selectBoardAllCount();
	
	public List<BoardVO> selectAllBoard();

	int getBoardAllCount();

	List<BoardVO> getAllBoard();
	
	public int createNewBoard(BoardVO boardVO);
	
	public int increaseViewCount(int id);
	
	public BoardVO getOneBoard(int id);
	
	public int updateOneBoard(BoardVO boardVO);
	
	public int deleteOneBoard(int id);
}
