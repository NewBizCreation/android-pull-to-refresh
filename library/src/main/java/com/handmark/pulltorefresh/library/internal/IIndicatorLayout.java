package com.handmark.pulltorefresh.library.internal;
/**
 * Indicator layout which react pulling or releasing of Pull To Refresh
 * <br />
 * NOTE : You have to override {@link IndicatorLayout} instead of IIndicatorLayout to make new Indicator layout. 
 * <br /> {@link PullToRefreshAdapterViewBase} uses indicator layouts as {@link IndicatorLayout} class
 * @author Wonjun Kim
 */
public interface IIndicatorLayout {
	/**
	 * Show the Indicator Layout 
	 */
	public void show();
	/**
	 * Hide the Indicator Layout 
	 */
	public void hide();
	/**
	 * Check whether this indicator layout is being shown or not
	 * @return true if the indicator layout is visible now 
	 */
	public boolean isVisible();
	/**
	 * Make a Action when "PullToRefresh" event has been fired
	 * <br />(Be called when {@link PullToRefreshAdapterViewBase#onPullToRefresh()} event occurs)
	 */
	public void pullToRefresh();
	/**
	 * Make a Action when "ReleaseToRefresh" event has been fired
	 * <br />(Be called when {@link PullToRefreshAdapterViewBase#onReleaseToRefresh()} event occurs)
	 */
	public void releaseToRefresh();
}
