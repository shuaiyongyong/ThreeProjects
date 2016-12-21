package com.yc.mybatis.service;

import java.util.List;

import com.yc.mybatis.entity.Favorite;
import com.yc.mybatis.entity.Tag;

public interface FavoriteService {

	boolean doAdd(Favorite f);

	List<Favorite> getAllFav();

	List<Tag> getAllTag();

	List<Favorite> selectFav(String f_tags);

	List<Favorite> selectAllFav();

	List<Favorite> selectSingleFav();

	boolean selectSingleTag(String t_name);

	boolean updateTag(String t_name);

	boolean insertTag(String t_name);

}
