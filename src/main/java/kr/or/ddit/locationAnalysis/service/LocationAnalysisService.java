package kr.or.ddit.locationAnalysis.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.or.ddit.locationAnalysis.dao.ILocationAnalysisDao;
import kr.or.ddit.locationAnalysis.model.LocationAnalysisVo;
import kr.or.ddit.locationAnalysis.model.LocationaVo;
import kr.or.ddit.member.model.MemberVo;
import kr.or.ddit.report.model.ReportVo;
import kr.or.ddit.select.model.RegionVo;

@Service
public class LocationAnalysisService implements ILocationAnalysisService {
	
	private static final Logger logger = LoggerFactory.getLogger(LocationAnalysisService.class);
	
	@Resource(name="locationAnalysisDao")
	private ILocationAnalysisDao locationAnalysisDao;

	/**
	 * 
	* Method : getRegion
	* 작성자 : 유민하
	* 변경이력 :
	* @return
	* Method 설명 : 입지분석시 선택할 대상지역 정보 모두 읽어오기
	 */
	@Override
	public List<RegionVo> getRegion() {
		return locationAnalysisDao.getRegion();
	}

	/**
	 * 
	* Method : getDong
	* 작성자 : 유민하
	* 변경이력 :
	* @param region_cd2
	* @return
	* Method 설명 : 입지분석시 선택한 구의 동 목록 출력
	 */
	@Override
	public List<RegionVo> getDong(int region_cd2) {
		return locationAnalysisDao.getDong(region_cd2);
	}

	/**
	 * 
	* Method : getInterestRegion
	* 작성자 : 유민하
	* 변경이력 :
	* @param member_id
	* @return
	* Method 설명 : 입지분석시 저장된 관심지역이 있을 경우 해당 정보 읽기
	 */
	@Override
	public RegionVo getInterestRegion(String member_id) {
		return locationAnalysisDao.getInterestRegion(member_id);
	}

	/**
	 * 
	* Method : getMember
	* 작성자 : 유민하
	* 변경이력 :
	* @param member_id
	* @return
	* Method 설명 : 회원의 아이디를 통해 관련 정보를 조회
	 */
	@Override
	public MemberVo getMember(String member_id) {
		return locationAnalysisDao.getMember(member_id);
	}

	/**
	 * 
	* Method : getOneRegion
	* 작성자 : 유민하
	* 변경이력 :
	* @param region_cd
	* @return
	* Method 설명 : 지역코드에 해당하는 지역정보 객체를 반환
	 */
	@Override
	public RegionVo getOneRegion(long region_cd) {
		return locationAnalysisDao.getOneRegion(region_cd);
	}

	/**
	 * 
	* Method : getStandard
	* 작성자 : 유민하
	* 변경이력 :
	* @return
	* Method 설명 : 대전지역의 업종별 최고매출액 조회
	 */
	@Override
	public List<LocationaVo> getStandard() {
		return locationAnalysisDao.getStandard();
	}

	/**
	 * 
	* Method : getObject
	* 작성자 : 유민하
	* 변경이력 :
	* @param region_cd
	* @return
	* Method 설명 : 선택지역의 업종별 최고매출액 조회
	 */
	@Override
	public List<LocationaVo> getObject(long region_cd) {
		return locationAnalysisDao.getObject(region_cd);
	}

	/**
	 * 
	* Method : getTobName
	* 작성자 : 유민하
	* 변경이력 :
	* @param tob_cd
	* @return
	* Method 설명 : 업종코드에 해당하는 업종명 출력
	 */
	@Override
	public String getTobName(String tob_cd) {
		return locationAnalysisDao.getTobName(tob_cd);
	}

	/**
	 * 
	* Method : getMove
	* 작성자 : 유민하
	* 변경이력 :
	* @param region_cd
	* @return
	* Method 설명 : 해당지역의 유동인구 출력
	 */
	@Override
	public int getMove(long region_cd) {
		return locationAnalysisDao.getMove(region_cd);
	}

	/**
	 * 
	* Method : getLive
	* 작성자 : 유민하
	* 변경이력 :
	* @param region_cd
	* @return
	* Method 설명 : 해장지역의 주거인구 출력
	 */
	@Override
	public int getLive(long region_cd) {
		return locationAnalysisDao.getLive(region_cd);
	}

	/**
	 * 
	* Method : getJob
	* 작성자 : 유민하
	* 변경이력 :
	* @param region_cd
	* @return
	* Method 설명 : 해당지역의 직장인구 출력
	 */
	@Override
	public int getJob(long region_cd) {
		return locationAnalysisDao.getJob(region_cd);
	}

	/**
	 * 
	* Method : getReport_cd
	* 작성자 : 유민하
	* 변경이력 :
	* @return
	* Method 설명 : report_cd를 가져오는 메서드
	 */
	@Override
	public String getReport_cd() {
		return locationAnalysisDao.getReport_cd();
	}
	
	/**
	 * 
	* Method : insertLocationaVo
	* 작성자 : 유민하
	* 변경이력 :
	* @param locationaVo
	* @return
	* Method 설명 : 분석한 업종별 입지등급과 매출액을 저장
	 */
	@Override
	public int insertLocationaVo(LocationaVo locationaVo) {
		return locationAnalysisDao.insertLocationaVo(locationaVo);
	}

	/**
	 * 
	* Method : insertLocationAnalysisVo
	* 작성자 : 유민하
	* 변경이력 :
	* @param locationAnalysisVo
	* @return
	* Method 설명 : 입지분석을 저장
	 */
	@Override
	public int insertLocationAnalysisVo(LocationAnalysisVo locationAnalysisVo) {
		return locationAnalysisDao.insertLocationAnalysisVo(locationAnalysisVo);
	}

	/**
	 * 
	* Method : insertReport
	* 작성자 : 유민하
	* 변경이력 :
	* @param reportVo
	* @return
	* Method 설명 : 분석보고서를 저장
	 */
	@Override
	public int insertReport(ReportVo reportVo) {
		return locationAnalysisDao.insertReport(reportVo);
	}

	/**
	 * 
	* Method : getLocationReport
	* 작성자 : 유민하
	* 변경이력 :
	* @param report_cd
	* @return
	* Method 설명 : 보고서코드에 맞는 선택지역 업종별 입지등급 리스트 조회
	 */
	@Override
	public List<LocationaVo> getLocationa(String report_cd) {
		return locationAnalysisDao.getLocationa(report_cd);
	}

	/**
	 * 
	* Method : getLocationReport
	* 작성자 : 유민하
	* 변경이력 :
	* @param report_cd
	* @return
	* Method 설명 : 보고서코드에 맞는 입지분석 데이터 조회(선택지역 입지등급 리스트 제외) 
	 */
	@Override
	public LocationAnalysisVo getLocationReport(String report_cd) {
		return locationAnalysisDao.getLocationReport(report_cd);
	}

}
