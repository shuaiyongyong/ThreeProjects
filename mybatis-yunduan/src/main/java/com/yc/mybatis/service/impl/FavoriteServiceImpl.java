package com.yc.mybatis.service.impl;

import java.util.List;

import com.yc.mybatis.entity.Favorite;
import com.yc.mybatis.entity.Tag;
import com.yc.mybatis.mapper.FavoriteMapper;
import com.yc.mybatis.service.FavoriteService;
import com.yc.mybatis.util.MybatisUtil;

public class FavoriteServiceImpl implements FavoriteService {
	private FavoriteMapper favoriteMapper;

	public FavoriteServiceImpl() {
		favoriteMapper = MybatisUtil.getAutoCommitSession().getMapper(FavoriteMapper.class);
	}
	@Override
	public boolean doAdd(Favorite f) {
		return favoriteMapper.doAdd(f) > 0;
	}
	@Override
	public List<Favorite> getAllFav() {
		return favoriteMapper.getAllFav();
	}
	@Override
	public List<Tag> getAllTag() {
		return favoriteMapper.getAllTag();
	}
	@Override
	public List<Favorite> selectFav(String f_tags) {
		return favoriteMapper.selectFav("%"+f_tags+"%");
	}
	@Override
	public List<Favorite> selectAllFav() {
		return favoriteMapper.selectAllFav();
	}
	@Override
	public List<Favorite> selectSingleFav() {
		return favoriteMapper.selectSingleFav();
	}
	@Override
	public boolean selectSingleTag(String t_name) {
		return favoriteMapper.selectSingleTag(t_name) >0;
	}
	@Override
	public boolean updateTag(String t_name) {
		return favoriteMapper.updateTag(t_name) > 0;
	}
	@Override
	public boolean insertTag(String t_name) {
		return favoriteMapper.insertTag(t_name) > 0;
	}

}
