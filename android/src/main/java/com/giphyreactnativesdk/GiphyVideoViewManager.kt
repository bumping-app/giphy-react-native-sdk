package com.giphyreactnativesdk

import com.facebook.react.bridge.ReadableMap
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp


class GiphyVideoViewManager(): SimpleViewManager<GiphyRNVideoView>() {
  override fun getName(): String {
    return "GiphyReactNativeVideoView"
  }

  @ReactProp(name="media")
  fun setMedia(videoView: GiphyRNVideoView, rnMedia: ReadableMap?) {
    videoView.setMedia(rnMedia)
  }

  @ReactProp(name="muted")
  fun setMuted(videoView: GiphyRNVideoView, rnMuted: Boolean?){
    videoView.setMuted(rnMuted)
  }

  // TODO v2 remove
  @ReactProp(name="playing")
  fun setPlaying(videoView: GiphyRNVideoView, rnPlaying: Boolean?) {
    videoView.setPlaying(rnPlaying)
  }

  @ReactProp(name="autoPlay")
  fun setAutoPlay(videoView: GiphyRNVideoView, autoPlay: Boolean?) {
    videoView.setAutoPlay(autoPlay)
  }

  override fun createViewInstance(reactContext: ThemedReactContext): GiphyRNVideoView {
    return GiphyRNVideoView(reactContext)
  }
}
