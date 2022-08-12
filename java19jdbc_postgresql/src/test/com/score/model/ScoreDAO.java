package test.com.score.model;

import java.util.List;

public interface ScoreDAO {

	public int insert(ScoreVO vo);

	public int update(ScoreVO vo);

	public int delete(ScoreVO vo);

	public ScoreVO selectOne(ScoreVO vo);

	public List<ScoreVO> selectAll();

	public List<ScoreVO> SearchNAME(String searchKey, String searchWord);
	public List<ScoreVO> SearchPoint(String searchKey, Integer searchPoint);

}
