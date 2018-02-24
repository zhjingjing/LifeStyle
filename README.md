# LifeStyle

     * 1：启动activity
     * onCreate---onStart---onResume
     * 2：销毁
     * onPause-onStop-onDestroy
     * 3：返回后台（home）
     * onPause-onStop
     * 4：返回前台
     * onRestart-onStart-onResume
     * 5：启动第二个activity
     *  onPause -2onCreate-2onStart-2onResume-onStop
     * 6：返回第一个activity
     *  2onPause-onRestart-onStart-onResume-2onStop-2onDestroy
     * 7:打开dialogActivity
     * onpause-DialogonCreate-DialogonStart-DialogonResume
     * 8:关闭dialogactivity
     *DialogonPause-onResume-DialogonStop-DialogonDestroy
     * 9：打开dialogactivity时返回后台
     *DialogonPause-onStop-DialogonStop
     * 10：打开dialogactivity时切回前台
     * onRestart-onStart-DialogonRestart-DialogonStart-DialogonResume
