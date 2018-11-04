# manual-android
android for me

### Reference

Android Cheatsheet for Graphic Designers :  
http://petrnohejl.github.io/Android-Cheatsheet-For-Graphic-Designers/

Android sample for Developer :  
https://developer.android.com/samples/

The Busy Coder's Guide to Android Development :  
https://commonsware.com/Android/

apps-for-android :  
https://code.google.com/archive/p/apps-for-android/

List of free and open-source Android applications :  
https://en.wikipedia.org/wiki/List_of_free_and_open-source_Android_applications

Google I/O Android App :  
https://github.com/google/iosched

Newly added links :  
http://aopensource.com/

lastfm/lastfm-android :  
https://github.com/lastfm/lastfm-android

### 단축키

ctrl + shift + u : 대문자,소문자 변환  
ctrl + alt + o : import 구문정리  
ctrl + alt + L : 자동정렬  
ctrl + d : 한줄 자동 복사  
ctrl + y : 한줄 자동 삭제  

### 주소록에서 번호 pick하기
```
1. 버튼등 OnClickListener등에 넣어 ﻿연락처 선택 화면이 나오게 합니다.
Intent intent = new Intent(Intent.ACTION_PICK);
	 intent.setData(ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
         startActivityForResult(intent, 0);


2. 연락처 선택을 하면 결과값을 받아옵니다.
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
if(resultCode == RESULT_OK)
{
Cursor cursor = getContentResolver().query(data.getData(), 
new String[]{ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, 
ContactsContract.CommonDataKinds.Phone.NUMBER}, null, null, null);
cursor.moveToFirst();
 	                name = cursor.getString(0);        //0은 이름을 얻어옵니다.
           number = cursor.getString(1);   //1은 번호를 받아옵니다.
            cursor.close();
}
super.onActivityResult(requestCode, resultCode, data);
} 
출처: http://jhrun.tistory.com/150 [JHRunning]
```

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
