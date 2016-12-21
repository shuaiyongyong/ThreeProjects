package com.yc.mybatis.mapper;

import java.util.List;

import com.yc.mybatis.entity.Favorite;
import com.yc.mybatis.entity.Tag;

public interface FavoriteMapper {

	int doAdd(Favorite f);

	List<Favorite> getAllFav();

	List<Tag> getAllTag();

	List<Favorite> selectFav(String f_tags);

	List<Favorite> selectAllFav();

	List<Favorite> selectSingleFav();

	int selectSingleTag(String t_name);

	int updateTag(String t_name);

	int insertTag(String t_name);


}
