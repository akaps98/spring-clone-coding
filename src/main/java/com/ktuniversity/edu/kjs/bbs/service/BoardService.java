package com.ktuniversity.edu.kjs.bbs.service;

import com.ktuniversity.edu.kjs.bbs.vo.BoardListVO;
import com.ktuniversity.edu.kjs.bbs.vo.BoardVO;

public interface BoardService {
	public BoardListVO getAllBoard();
	
	public boolean createNewBoard(BoardVO boardVO);
	
	public BoardVO getOneBoard(int id, boolean isIncrease);
	
	public boolean updateOneBoard(BoardVO boardVO);
	
	public boolean deleteOneBoard(int id);
}
