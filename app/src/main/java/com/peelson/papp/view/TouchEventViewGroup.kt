package com.peelson.papp.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ViewGroup

/**
 * https://github.com/Mr-YangCheng/ForAndroidInterview/blob/master/android/Android%20%E8%87%AA%E5%AE%9A%E4%B9%89ViewGroup%E5%85%A5%E9%97%A8%E5%AE%9E%E8%B7%B5.md
 */
class TouchEventViewGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ViewGroup(context, attrs, defStyleAttr) {

    /// 绘制期间的回调

    /**
     * 先走 [measure] 再到 [onMeasure]
     *
     * 但 [measure] 被 [final] 修饰，不可以重写
     */
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    /**
     * 先走 [layout] 再走 [onLayout]
     */
    override fun onLayout(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) {

    }

    /**
     * 先走 [dispatchDraw] 然后是 [draw] 再到 [onDraw]
     *
     * [dispatchDraw] 在 [View] 中是空函数，[ViewGroup] 复写了 [dispatchDraw] 来对其子视图进行绘制
     */
    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

    /// 生命周期的回调

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
    }

    /// 触摸事件

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return super.onInterceptTouchEvent(ev)
    }
}