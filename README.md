# manual-android
android for me

### build 시간 줄이기  
http://gun0912.tistory.com/76

### 같은코드 서로 다른 앱 만들기  
http://gun0912.tistory.com/74

### Flavor 공식문서  
https://developer.android.com/studio/build/build-variants

### Log  

```
Log.v(); // Verbose
Log.d(); // Debug
Log.i(); // Info
Log.w(); // Warning
Log.e(); // Error

// 개발이 끝나고 난뒤 log값만 주석처리하면됨
public static void showLogDebug(String tag, String msg) {
    android.util.Log.d(tag, msg);
}

```

### AsyncTask

```
// 각 상속 메소드별 return형과 매개변수는 
// paramsType(doInBackground), progress, returnType(doInBackground)
public class async_url_list extends AsyncTask<List<String> , Integer, List<String>>


① onPreExecute()
AsyncTask의 작업은 메인 스레드에서 MyAsyncTask.execute(); 이런 식으로 실행시키는데 이 코드가 실행되면 작업 전에 제일 먼저 onPreExecute() 메서드가 호출된다. 본격적인 작업에 앞서 준비 작업을 진행하는 곳이라고 보면 된다. 

② doInBackground()
메인 작업이 실행되는 곳. 이곳에서 실행된 결괏값은 result에 담아 리턴했다.

③ onProgressUpdate()
doInBackground() 작업 도중 publishProgress()를 호출하면 onPressUpdate() 가 실행된다.
사용자에게 진행 상황을 알릴 때 사용된다. (ex. Toast 메시지 : "현재 진행 중입니다.")

④ onPostExecute()
doInBackground()에서 리턴 한 값을 전달받아서 매개변수로 사용한다.
넘겨받은 result를 통해 UI 변경 작업을 진행한다.(ex setText(result))...
[출처] AsyncTask 사용하기|작성자 스제
```
