package com.xyoung.baselibrary.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by xiangyang on 2018/4/27.
 *
 * 不可滑动的viewpager
 */

public class NoSlideViewPager extends ViewPager {

	private boolean isCanScroll = true;

	public void setCanScroll(boolean scroll){
		this.isCanScroll = scroll;
	}

	public boolean isCanScroll(){
		return this.isCanScroll;
	}

	public NoSlideViewPager(Context context) {
		super(context);
	}

	public NoSlideViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	@Override
	public boolean onInterceptTouchEvent(MotionEvent arg0) {
		if (!isCanScroll) {
			return false;
		}
		return super.onInterceptTouchEvent(arg0);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent arg0) {
		if (!isCanScroll) {
			return false;
		}
		return super.onTouchEvent(arg0);
	}
	
//	@SuppressLint("NewApi")
	@Override
	public boolean canScrollHorizontally(int direction) {
		if (!isCanScroll) {
			return false;
		}
		return super.canScrollHorizontally(direction);
	}
	
}
