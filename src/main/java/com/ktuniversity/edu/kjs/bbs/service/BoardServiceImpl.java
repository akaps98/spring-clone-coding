package com.ktuniversity.edu.kjs.bbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktuniversity.edu.kjs.bbs.dao.BoardDao;
import com.ktuniversity.edu.kjs.bbs.vo.BoardListVO;
import com.ktuniversity.edu.kjs.bbs.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public BoardListVO getAllBoard() {
		BoardListVO boardListVO = new BoardListVO();
		boardListVO.setBoardCnt(boardDao.getBoardAllCount());
		boardListVO.setBoardList(boardDao.getAllBoard());
		
		return boardListVO;
	}

	@Override
	public boolean createNewBoard(BoardVO boardVO) {
		int createCount = boardDao.createNewBoard(boardVO);
		
		return createCount > 0;
	}

	@Override
	public BoardVO getOneBoard(int id, boolean isIncrease) {
		if(isIncrease) {
			int updateCount = boardDao.increaseViewCount(id);
			
			if(updateCount == 0) {
				throw new IllegalArgumentException("Invalid approach!");
			}
		}
		
		BoardVO boardVO = boardDao.getOneBoard(id);
		
		if(boardVO == null) {
			throw new IllegalArgumentException("Invalid approach!");
		}
		
		return boardVO;
	}

	@Override
	public boolean updateOneBoard(BoardVO boardVO) {
		int updateCount = boardDao.updateOneBoard(boardVO);
		
		return updateCount > 0;
	}

	@Override
	public boolean deleteOneBoard(int id) {
		int deleteCount = boardDao.deleteOneBoard(id);
		
		return deleteCount > 0;
	}

}
