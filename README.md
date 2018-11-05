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

### 공부.....

Android 6.0(API 레벨 23)부터 사용자는 앱이 설치될 때가 아니라 앱이 실행되는 중에 앱에 권한을 부여합니다. 이 접근방식에서는 사용자가 앱을 설치하거나 업데이트할 때 권한을 부여할 필요가 없으므로 앱 설치 과정이 간소화됩니다. 또한 사용자가 앱의 기능을 더 세부적으로 제어할 수 있습니다. 예를 들어, 기기 위치가 아니라 카메라에 대한 액세스 권한을 카메라 앱에 부여하도록 선택할 수 있습니다. 사용자는 앱 설정 화면으로 이동하여 언제든지 권한을 취소할 수 있습니다.

### 단축키

ctrl + shift + u : 대문자,소문자 변환  
ctrl + alt + o : import 구문정리  
ctrl + alt + L : 자동정렬  
ctrl + d : 한줄 자동 복사  
ctrl + y : 한줄 자동 삭제  
ctrl + w : 단락선택

### 위치정보 가져오기
```
Geocoder 설명 
https://m.blog.naver.com/PostView.nhn?blogId=trylsj&logNo=220708881021&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F#

위도,경도 예제( 퍼미션 코드 따로넣어야함 )
http://bitsoul.tistory.com/135

getContryname() : 국가명  
getAdminArea() : 시  
getLocality() : 인천시 서구 -> 인천시  
getSubLocality() : 인천시 서구 -> 서구  
getThoroughfare() : 동  
getSubThoroughfare() : 번지  
getFeatureName() : 번지  
getAddressLine(0).toString() // 국가명 시 군 구 동 번지  
```

### 공유하기
```
Intent msg = new Intent(Intent.ACTION_SEND);
msg.addCategory(Intent.CATEGORY_DEFAULT);
msg.putExtra(Intent.EXTRA_SUBJECT,"주제");
msg.putExtra(Intent.EXTRA_TEXT,"내용");
msg.putExtra(Intent.EXTRA_TITLE,"제목");
msg.setType("text/plain");
startActivity(Intent.createChooser(msg, "공유"));
```

### 전화걸기
```
<string name="data_phone">tel:1111111</string>
startActivity(new Intent("android.intent.action.CALL", Uri.parse(tel)));
startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
http://mainia.tistory.com/4884
```

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

### TextView 흐르게하기
```
txtCurrentPositionInfo = (TextView)item_fragment_tab_1_2.findViewById(R.id.item_text_1);
txtCurrentPositionInfo.setSelected(true);

android:ellipsize="marquee"
android:singleLine="true"
	    
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

### ToggleButton
```
        <ToggleButton
            android:gravity="center"
            android:id="@+id/item_text_2"
            android:layout_alignParentRight="true"
            android:layout_centerVertical="true"
            android:padding="5dp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="10dp"
            android:textOff="현재위치"
            android:textOn="현재위치"
            android:textColorHint="@color/gray"
            android:textColor="@color/gray"
            android:textSize="@dimen/text_small"
            android:drawableLeft="@drawable/ic_my_location_gray"
            android:background="@drawable/rounded_border_edittext"
            />
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
