package com.constant01.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.constant01.mapper.ReserveMapper;
import com.constant01.model.ReserveDTO;
@Service
public class ReserveServiceImpl implements ReserveService{
	
	@Autowired
	ReserveMapper rm;
	
	public void write(ReserveDTO reserve) {
		rm.write(reserve);
	}
	
	public ArrayList<ReserveDTO> list(ReserveDTO reserve) {
		// 회원상세내용
		return rm.list(reserve);
	}
	
	public ArrayList<ReserveDTO> list2(ReserveDTO reserve) {
		// 회원상세내용
		return rm.list2(reserve);
	}
	
}