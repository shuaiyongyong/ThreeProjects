package com.yc.mybatis.web.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.mybatis.entity.Favorite;
import com.yc.mybatis.entity.Tag;
import com.yc.mybatis.service.FavoriteService;
import com.yc.mybatis.service.impl.FavoriteServiceImpl;

/**
 * Servlet implementation class FavoriteSerlet
 */
@WebServlet("/fav.do/*")
public class FavoriteSerlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	private FavoriteService favoriteService;
	
	public FavoriteSerlet() {
		favoriteService = new FavoriteServiceImpl();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getRequestURI().endsWith("select")){
			doSelect(request,response);
		} else if(request.getRequestURI().endsWith("add")){
			doAdd(request,response);
		}else if(request.getRequestURI().endsWith("addTag")){
			doAddTag(request,response);
		}else if(request.getRequestURI().endsWith("favList")){
			doFavList(request,response);
		}else if(request.getRequestURI().endsWith("tagList")){
			doTagList(request,response);
		}
	}

	private void doTagList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Tag> tag = favoriteService.getAllTag();
		respOutStr(response, doJsonStr(tag));
	}

	private void doFavList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Favorite> fav = favoriteService.getAllFav();
		respOutStr(response, doJsonStr(fav));
		
	}

	private void doSelect(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Favorite f = new Favorite();
		String f_tags = request.getParameter("tag");
		System.out.println(f_tags);
		if(f_tags.equals("0")){
			List<Favorite> fav = favoriteService.selectAllFav();
			respOutStr(response, doJsonStr(fav));
		}else if(f_tags.equals("-1")){
			List<Favorite> fav = favoriteService.selectSingleFav();
			respOutStr(response, doJsonStr(fav));
		}else{
			f.setF_tags(f_tags);
			List<Favorite> fav = favoriteService.selectFav(f_tags);
			respOutStr(response,  doJsonStr(fav));
		}
	}

	private void doAdd(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String label = request.getParameter("label");
		String url = request.getParameter("url");
		String tags = request.getParameter("tags");
		String desc = request.getParameter("desc");
		
		Favorite f = new Favorite();
		f.setF_label(label);
		f.setF_url(url);
		f.setF_tags(tags);
		f.setF_desc(desc);
		
		respOutStr(response, favoriteService.doAdd(f) + ""); 
		
	}


	private void doAddTag(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String tags = request.getParameter("tags");

		String[] str= tags.split(",");
	    List  list = Arrays.asList(str);
	    for (Object t_name : list) {
			if(favoriteService.selectSingleTag(t_name.toString())){
				respOutStr(response, favoriteService.updateTag(t_name.toString()) + ""); 
			}else{
				respOutStr(response, favoriteService.insertTag(t_name.toString()) + ""); 
			}
		}
		
	}
	
}
