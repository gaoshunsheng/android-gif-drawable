package pl.droidsonroids.gif;

/**
* @ClassName: GifListener 
* @Description: gif动画事件回调接口，如果需要得到Gif动画播放过程中的相关事件，必须实现本接口
* @author gaoshunsheng
* @date 2014-5-22 上午9:44:07 
*
 */
public interface GifListener {
	/**
	 * gif动画播放结束事件，每播放完一次都会触发本事件
	 * @param num 播放次数
	 */
	public void gifEnd(int num);
	
	/**
	 * gif动画当前帧数事件
	 * @param currentFrame
	 * @param currentFrame
	 */
	public void frameCount(int currentFrame, int totalFrameCount);
	
}
