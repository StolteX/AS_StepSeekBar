package com.stoltex.ASStepSeekBar;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_b4xpagesmanager_subs_0 {


public static RemoteObject  _activity_pause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,635);
if (RapidSub.canDelegate("activity_pause")) { return __ref.runUserSub(false, "b4xpagesmanager","activity_pause", __ref);}
 BA.debugLineNum = 635;BA.debugLine="Public Sub Activity_Pause";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 636;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseeventwithresult:::" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ )),(Object)(BA.ObjectToString("B4XPage_Disappear")),(Object)((b4i_main.__c.runMethod(false,"Null"))));
 BA.debugLineNum = 637;BA.debugLine="BackgroundStateChanged(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_backgroundstatechanged:" /*RemoteObject*/ ,(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,610);
if (RapidSub.canDelegate("activity_resume")) { return __ref.runUserSub(false, "b4xpagesmanager","activity_resume", __ref);}
RemoteObject _shouldraise = RemoteObject.createImmutable(false);
 BA.debugLineNum = 610;BA.debugLine="Public Sub Activity_Resume";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 611;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
Debug.JustUpdateDeviceLine();
_shouldraise = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_isforeground" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False")));Debug.locals.put("ShouldRaise", _shouldraise);Debug.locals.put("ShouldRaise", _shouldraise);
 BA.debugLineNum = 612;BA.debugLine="BackgroundStateChanged(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_backgroundstatechanged:" /*RemoteObject*/ ,(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 613;BA.debugLine="If ShouldRaise Then";
Debug.JustUpdateDeviceLine();
if (_shouldraise.getBoolean()) { 
 BA.debugLineNum = 614;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseevent:::" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ )),(Object)(BA.ObjectToString("B4XPage_Appear")),(Object)((b4i_main.__c.runMethod(false,"Null"))));
 };
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpage(RemoteObject __ref,RemoteObject _id,RemoteObject _b4xpage) throws Exception{
try {
		Debug.PushSubsStack("AddPage (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,141);
if (RapidSub.canDelegate("addpage")) { return __ref.runUserSub(false, "b4xpagesmanager","addpage", __ref, _id, _b4xpage);}
RemoteObject _idtolower = RemoteObject.createImmutable("");
Debug.locals.put("Id", _id);
Debug.locals.put("B4XPage", _b4xpage);
 BA.debugLineNum = 141;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
Debug.JustUpdateDeviceLine();
_idtolower = _id.runMethod(true,"ToLowerCase");Debug.locals.put("IdToLower", _idtolower);Debug.locals.put("IdToLower", _idtolower);
 BA.debugLineNum = 143;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_containskey:" /*RemoteObject*/ ,(Object)((_idtolower))).getBoolean()) { 
 BA.debugLineNum = 144;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","97602179",(RemoteObject.concat(RemoteObject.createImmutable("Page with this id already exists: "),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((_idtolower))),RemoteObject.createImmutable("!"))),0);
 BA.debugLineNum = 145;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 147;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_put::" /*RemoteObject*/ ,(Object)((_idtolower)),(Object)((__ref.runClassMethod (b4i_b4xpagesmanager.class, "_createb4xpageinfo::::" /*RemoteObject*/ ,(Object)(_b4xpage),(Object)(_idtolower),(Object)(b4i_main.__c.runMethod(true,"False")),(Object)((_id))))));
 BA.debugLineNum = 148;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_showpage:" /*RemoteObject*/ ,(Object)(_idtolower));};
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpageandcreate(RemoteObject __ref,RemoteObject _id,RemoteObject _b4xpage) throws Exception{
try {
		Debug.PushSubsStack("AddPageAndCreate (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,151);
if (RapidSub.canDelegate("addpageandcreate")) { return __ref.runUserSub(false, "b4xpagesmanager","addpageandcreate", __ref, _id, _b4xpage);}
Debug.locals.put("Id", _id);
Debug.locals.put("B4XPage", _b4xpage);
 BA.debugLineNum = 151;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="AddPage (Id, B4XPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_addpage::" /*RemoteObject*/ ,(Object)(_id),(Object)(_b4xpage));
 BA.debugLineNum = 153;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_createpageifneeded:" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_b4xpagesmanager.class, "_getpagefromid:" /*RemoteObject*/ ,(Object)(_id))));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4ipage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4iPage_Appear (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,234);
if (RapidSub.canDelegate("b4ipage_appear")) { return __ref.runUserSub(false, "b4xpagesmanager","b4ipage_appear", __ref);}
RemoteObject _page = RemoteObject.declareNull("B4IPage");
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
 BA.debugLineNum = 234;BA.debugLine="Private Sub B4iPage_Appear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Dim page As Page = Sender";
Debug.JustUpdateDeviceLine();
_page = RemoteObject.createNew ("B4IPage");
_page = BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IPage"), b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi")));Debug.locals.put("page", _page);Debug.locals.put("page", _page);
 BA.debugLineNum = 236;BA.debugLine="Dim pi As B4XPageInfo = RootB4XToPage.Get(page.Ro";
Debug.JustUpdateDeviceLine();
_pi = (__ref.getField(false,"_rootb4xtopage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_get:" /*RemoteObject*/ ,(Object)(((_page.runMethod(false,"RootPanel")).getObject()))));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 237;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_add:" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 BA.debugLineNum = 238;BA.debugLine="UpdateStackString";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_updatestackstring" /*RemoteObject*/ );
 BA.debugLineNum = 239;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseevent:::" /*RemoteObject*/ ,(Object)(_pi),(Object)(BA.ObjectToString("B4XPage_Appear")),(Object)((b4i_main.__c.runMethod(false,"Null"))));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4ipage_barbuttonclick(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("B4iPage_BarButtonClick (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,271);
if (RapidSub.canDelegate("b4ipage_barbuttonclick")) { return __ref.runUserSub(false, "b4xpagesmanager","b4ipage_barbuttonclick", __ref, _tag);}
RemoteObject _page = RemoteObject.declareNull("B4IPage");
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 271;BA.debugLine="Private Sub B4iPage_BarButtonClick (Tag As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 272;BA.debugLine="Dim page As Page = Sender";
Debug.JustUpdateDeviceLine();
_page = RemoteObject.createNew ("B4IPage");
_page = BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IPage"), b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi")));Debug.locals.put("page", _page);Debug.locals.put("page", _page);
 BA.debugLineNum = 273;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(page.RootPanel), \"";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseevent:::" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_b4xpagesmanager.class, "_getpageinfofromroot:" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_page.runMethod(false,"RootPanel")).getObject()))),(Object)(BA.ObjectToString("B4XPage_MenuClick")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(_tag)})));
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4ipage_disappear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4iPage_Disappear (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,242);
if (RapidSub.canDelegate("b4ipage_disappear")) { return __ref.runUserSub(false, "b4xpagesmanager","b4ipage_disappear", __ref);}
RemoteObject _page = RemoteObject.declareNull("B4IPage");
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
 BA.debugLineNum = 242;BA.debugLine="Private Sub B4iPage_Disappear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="Dim page As Page = Sender";
Debug.JustUpdateDeviceLine();
_page = RemoteObject.createNew ("B4IPage");
_page = BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IPage"), b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi")));Debug.locals.put("page", _page);Debug.locals.put("page", _page);
 BA.debugLineNum = 244;BA.debugLine="Dim pi As B4XPageInfo = RootB4XToPage.Get(page.Ro";
Debug.JustUpdateDeviceLine();
_pi = (__ref.getField(false,"_rootb4xtopage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_get:" /*RemoteObject*/ ,(Object)(((_page.runMethod(false,"RootPanel")).getObject()))));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 245;BA.debugLine="RaiseEvent(pi, \"B4XPage_Disappear\", Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseevent:::" /*RemoteObject*/ ,(Object)(_pi),(Object)(BA.ObjectToString("B4XPage_Disappear")),(Object)((b4i_main.__c.runMethod(false,"Null"))));
 BA.debugLineNum = 246;BA.debugLine="If GetTopPage = pi Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ ),_pi)) { 
 BA.debugLineNum = 247;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_remove:" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 249;BA.debugLine="UpdateStackString";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_updatestackstring" /*RemoteObject*/ );
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4ipage_keyboardstatechanged(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("B4iPage_KeyboardStateChanged (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,256);
if (RapidSub.canDelegate("b4ipage_keyboardstatechanged")) { return __ref.runUserSub(false, "b4xpagesmanager","b4ipage_keyboardstatechanged", __ref, _height);}
RemoteObject _page = RemoteObject.declareNull("B4IPage");
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
Debug.locals.put("Height", _height);
 BA.debugLineNum = 256;BA.debugLine="Private Sub B4iPage_KeyboardStateChanged (Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="Dim page As Page";
Debug.JustUpdateDeviceLine();
_page = RemoteObject.createNew ("B4IPage");Debug.locals.put("page", _page);
 BA.debugLineNum = 258;BA.debugLine="If (Sender Is Page) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi")), RemoteObject.createImmutable("UIViewController")))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 259;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ );Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 260;BA.debugLine="If pi <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_pi)) { 
 BA.debugLineNum = 261;BA.debugLine="page = pi.Parent.NativeType";
Debug.JustUpdateDeviceLine();
_page = _pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"NativeType" /*RemoteObject*/ );Debug.locals.put("page", _page);
 };
 }else {
 BA.debugLineNum = 264;BA.debugLine="page = Sender";
Debug.JustUpdateDeviceLine();
_page = BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IPage"), b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi")));Debug.locals.put("page", _page);
 };
 BA.debugLineNum = 266;BA.debugLine="If page.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_page.runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 267;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(page.RootPanel),";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseevent:::" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_b4xpagesmanager.class, "_getpageinfofromroot:" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_page.runMethod(false,"RootPanel")).getObject()))),(Object)(BA.ObjectToString("B4XPage_KeyboardStateChanged")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(_height)})));
 };
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4ipage_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("B4iPage_Resize (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,252);
if (RapidSub.canDelegate("b4ipage_resize")) { return __ref.runUserSub(false, "b4xpagesmanager","b4ipage_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 252;BA.debugLine="Private Sub B4iPage_Resize (Width As Float, Height";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 253;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseevent:::" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_b4xpagesmanager.class, "_getpageinfofromroot:" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi"))))),(Object)(BA.ObjectToString("B4XPage_Resize")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(_width),(_height)})));
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backgroundstatechanged(RemoteObject __ref,RemoteObject _newstate) throws Exception{
try {
		Debug.PushSubsStack("BackgroundStateChanged (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,618);
if (RapidSub.canDelegate("backgroundstatechanged")) { return __ref.runUserSub(false, "b4xpagesmanager","backgroundstatechanged", __ref, _newstate);}
RemoteObject _ev = RemoteObject.createImmutable("");
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
Debug.locals.put("NewState", _newstate);
 BA.debugLineNum = 618;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 619;BA.debugLine="If IsForeground = NewState Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isforeground" /*RemoteObject*/ ),_newstate)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 620;BA.debugLine="IsForeground = NewState";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isforeground" /*RemoteObject*/ ,_newstate);
 BA.debugLineNum = 621;BA.debugLine="Dim ev As String";
Debug.JustUpdateDeviceLine();
_ev = RemoteObject.createImmutable("");Debug.locals.put("ev", _ev);
 BA.debugLineNum = 622;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isforeground" /*RemoteObject*/ ).getBoolean()) { 
_ev = BA.ObjectToString("B4XPage_Foreground");Debug.locals.put("ev", _ev);}
else {
_ev = BA.ObjectToString("B4XPage_Background");Debug.locals.put("ev", _ev);};
 BA.debugLineNum = 623;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = __ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"Size").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (group5.runMethod(false,"Get:",index5));Debug.locals.put("pi", _pi);
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 624;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_ev),(Object)(BA.numberCast(int.class, 0))).getBoolean()) { 
 BA.debugLineNum = 625;BA.debugLine="LogEvent(pi, ev)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_logevent::" /*RemoteObject*/ ,(Object)(_pi),(Object)(_ev));
 BA.debugLineNum = 626;BA.debugLine="If IsForeground Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isforeground" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 627;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("CallSubDelayed:::",__ref.getField(false, "bi"),(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_ev));
 }else {
 BA.debugLineNum = 629;BA.debugLine="CallSub(pi.B4XPage, ev)";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runMethodAndSync(false,"CallSub:::",__ref.getField(false, "bi"),(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_ev));
 };
 };
 }
}Debug.locals.put("pi", _pi);
;
 BA.debugLineNum = 633;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
b4i_b4xpagesmanager._idtob4xpage = RemoteObject.createNew ("b4i_b4xorderedmap");__ref.setField("_idtob4xpage",b4i_b4xpagesmanager._idtob4xpage);
 //BA.debugLineNum = 24;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
b4i_b4xpagesmanager._rootb4xtopage = RemoteObject.createNew ("b4i_b4xorderedmap");__ref.setField("_rootb4xtopage",b4i_b4xpagesmanager._rootb4xtopage);
 //BA.debugLineNum = 32;BA.debugLine="Type B4XPageParent (NativeType As Page)";
;
 //BA.debugLineNum = 34;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
 //BA.debugLineNum = 38;BA.debugLine="Public mStackOfPageIds As B4XSet";
b4i_b4xpagesmanager._mstackofpageids = RemoteObject.createNew ("b4i_b4xset");__ref.setField("_mstackofpageids",b4i_b4xpagesmanager._mstackofpageids);
 //BA.debugLineNum = 39;BA.debugLine="Private xui As XUI 'ignore";
b4i_b4xpagesmanager._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_b4xpagesmanager._xui);
 //BA.debugLineNum = 47;BA.debugLine="Private mMainForm As NavigationController";
b4i_b4xpagesmanager._mmainform = RemoteObject.createNew ("B4INavigationControllerWrapper");__ref.setField("_mmainform",b4i_b4xpagesmanager._mmainform);
 //BA.debugLineNum = 49;BA.debugLine="Public IsForeground As Boolean";
b4i_b4xpagesmanager._isforeground = RemoteObject.createImmutable(false);__ref.setField("_isforeground",b4i_b4xpagesmanager._isforeground);
 //BA.debugLineNum = 50;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
b4i_b4xpagesmanager._transitionanimationduration = BA.numberCast(int.class, 100);__ref.setField("_transitionanimationduration",b4i_b4xpagesmanager._transitionanimationduration);
 //BA.debugLineNum = 51;BA.debugLine="Public MainPage As B4XMainPage";
b4i_b4xpagesmanager._mainpage = RemoteObject.createNew ("b4i_b4xmainpage");__ref.setField("_mainpage",b4i_b4xpagesmanager._mainpage);
 //BA.debugLineNum = 52;BA.debugLine="Private StackString As String";
b4i_b4xpagesmanager._stackstring = RemoteObject.createImmutable("");__ref.setField("_stackstring",b4i_b4xpagesmanager._stackstring);
 //BA.debugLineNum = 53;BA.debugLine="Public LogEvents As Boolean = False";
b4i_b4xpagesmanager._logevents = b4i_main.__c.runMethod(true,"False");__ref.setField("_logevents",b4i_b4xpagesmanager._logevents);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _closepage(RemoteObject __ref,RemoteObject _b4xpage) throws Exception{
try {
		Debug.PushSubsStack("ClosePage (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,209);
if (RapidSub.canDelegate("closepage")) { return __ref.runUserSub(false, "b4xpagesmanager","closepage", __ref, _b4xpage);}
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
RemoteObject _isclosingtoppage = RemoteObject.createImmutable(false);
Debug.locals.put("B4XPage", _b4xpage);
 BA.debugLineNum = 209;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 210;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4i_b4xpagesmanager.class, "_findpifromb4xpage:" /*RemoteObject*/ ,(Object)(_b4xpage));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 211;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_contains:" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ )))),b4i_main.__c.runMethod(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 212;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4i")) && RemoteObject.solveBoolean("!",__ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ ),_pi)) { 
 BA.debugLineNum = 213;BA.debugLine="Log(\"Only top page can be closed\")";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","97864324",RemoteObject.createImmutable("Only top page can be closed"),0);
 BA.debugLineNum = 214;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 215;BA.debugLine="Else If xui.IsB4i And mStackOfPageIds.Size = 1 Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4i")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 216;BA.debugLine="Log(\"First page cannot be closed\")";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","97864327",RemoteObject.createImmutable("First page cannot be closed"),0);
 BA.debugLineNum = 217;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 219;BA.debugLine="Dim IsClosingTopPage As Boolean = GetTopPage = pi";
Debug.JustUpdateDeviceLine();
_isclosingtoppage = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ ),_pi));Debug.locals.put("IsClosingTopPage", _isclosingtoppage);Debug.locals.put("IsClosingTopPage", _isclosingtoppage);
 BA.debugLineNum = 220;BA.debugLine="ClosePageImpl(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_closepageimpl:" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 221;BA.debugLine="If IsClosingTopPage Then";
Debug.JustUpdateDeviceLine();
if (_isclosingtoppage.getBoolean()) { 
 BA.debugLineNum = 222;BA.debugLine="TopPageDisappear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_toppagedisappear" /*RemoteObject*/ );
 };
 BA.debugLineNum = 224;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4A")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 225;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_remove:" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 BA.debugLineNum = 226;BA.debugLine="If IsClosingTopPage Then";
Debug.JustUpdateDeviceLine();
if (_isclosingtoppage.getBoolean()) { 
 BA.debugLineNum = 227;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4A").getBoolean()) { 
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_showpageimpl:" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ )));};
 BA.debugLineNum = 228;BA.debugLine="TopPageAppear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_toppageappear" /*RemoteObject*/ );
 };
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _closepageimpl(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("ClosePageImpl (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,315);
if (RapidSub.canDelegate("closepageimpl")) { return __ref.runUserSub(false, "b4xpagesmanager","closepageimpl", __ref, _pi);}
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 315;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="mMainForm.RemoveCurrentPage2(TransitionAnimationD";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mmainform" /*RemoteObject*/ ).runVoidMethod ("RemoveCurrentPage2:",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_transitionanimationduration" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createb4xpageinfo(RemoteObject __ref,RemoteObject _b4xpage,RemoteObject _id,RemoteObject _created,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("CreateB4XPageInfo (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,420);
if (RapidSub.canDelegate("createb4xpageinfo")) { return __ref.runUserSub(false, "b4xpagesmanager","createb4xpageinfo", __ref, _b4xpage, _id, _created, _title);}
RemoteObject _t1 = RemoteObject.declareNull("_b4xpageinfo");
Debug.locals.put("B4XPage", _b4xpage);
Debug.locals.put("Id", _id);
Debug.locals.put("Created", _created);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 420;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 421;BA.debugLine="Dim t1 As B4XPageInfo";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("_b4xpageinfo");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 422;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 423;BA.debugLine="t1.B4XPage = B4XPage";
Debug.JustUpdateDeviceLine();
_t1.setField ("B4XPage" /*RemoteObject*/ ,_b4xpage);
 BA.debugLineNum = 424;BA.debugLine="t1.Id = Id";
Debug.JustUpdateDeviceLine();
_t1.setField ("Id" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 425;BA.debugLine="t1.Created = Created";
Debug.JustUpdateDeviceLine();
_t1.setField ("Created" /*RemoteObject*/ ,_created);
 BA.debugLineNum = 426;BA.debugLine="t1.Title = Title";
Debug.JustUpdateDeviceLine();
_t1.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 427;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createb4xpageparent(RemoteObject __ref,RemoteObject _nativetype) throws Exception{
try {
		Debug.PushSubsStack("CreateB4XPageParent (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,602);
if (RapidSub.canDelegate("createb4xpageparent")) { return __ref.runUserSub(false, "b4xpagesmanager","createb4xpageparent", __ref, _nativetype);}
RemoteObject _t1 = RemoteObject.declareNull("_b4xpageparent");
Debug.locals.put("NativeType", _nativetype);
 BA.debugLineNum = 602;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As Pag";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 604;BA.debugLine="Dim t1 As B4XPageParent";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("_b4xpageparent");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 605;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 606;BA.debugLine="t1.NativeType = NativeType";
Debug.JustUpdateDeviceLine();
_t1.setField ("NativeType" /*RemoteObject*/ ,_nativetype);
 BA.debugLineNum = 607;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 608;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpageifneeded(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("CreatePageIfNeeded (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,352);
if (RapidSub.canDelegate("createpageifneeded")) { return __ref.runUserSub(false, "b4xpagesmanager","createpageifneeded", __ref, _pi);}
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 352;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 353;BA.debugLine="If pi.Created Then Return";
Debug.JustUpdateDeviceLine();
if (_pi.getField(true,"Created" /*RemoteObject*/ ).getBoolean()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 354;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
Debug.JustUpdateDeviceLine();
_pi.setField ("IsFirst" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))));
 BA.debugLineNum = 355;BA.debugLine="CreatePageImpl (pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_createpageimpl:" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 356;BA.debugLine="pi.Created = True";
Debug.JustUpdateDeviceLine();
_pi.setField ("Created" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 357;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rootb4xtopage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_put::" /*RemoteObject*/ ,(Object)(((_pi.getField(false,"Root" /*RemoteObject*/ )).getObject())),(Object)((_pi)));
 BA.debugLineNum = 358;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_logevent::" /*RemoteObject*/ ,(Object)(_pi),(Object)(RemoteObject.createImmutable("B4XPage_Created")));
 BA.debugLineNum = 359;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runMethodAndSync(false,"CallSub2::::",__ref.getField(false, "bi"),(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(BA.ObjectToString("B4XPage_Created")),(Object)((_pi.getField(false,"Root" /*RemoteObject*/ ))));
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpageimpl(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("CreatePageImpl (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,369);
if (RapidSub.canDelegate("createpageimpl")) { return __ref.runUserSub(false, "b4xpagesmanager","createpageimpl", __ref, _pi);}
RemoteObject _page = RemoteObject.declareNull("B4IPage");
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 369;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 386;BA.debugLine="Dim page As Page";
Debug.JustUpdateDeviceLine();
_page = RemoteObject.createNew ("B4IPage");Debug.locals.put("page", _page);
 BA.debugLineNum = 387;BA.debugLine="page.Initialize(\"B4iPage\")";
Debug.JustUpdateDeviceLine();
_page.runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("B4iPage")));
 BA.debugLineNum = 388;BA.debugLine="pi.Parent = CreateB4XPageParent(page)";
Debug.JustUpdateDeviceLine();
_pi.setField ("Parent" /*RemoteObject*/ ,__ref.runClassMethod (b4i_b4xpagesmanager.class, "_createb4xpageparent:" /*RemoteObject*/ ,(Object)(_page)));
 BA.debugLineNum = 389;BA.debugLine="pi.Root = pi.Parent.NativeType.RootPanel";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Root" /*RemoteObject*/ ).setObject ((_pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"NativeType" /*RemoteObject*/ ).runMethod(false,"RootPanel")).getObject());
 BA.debugLineNum = 390;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"NativeType" /*RemoteObject*/ ).runMethod(true,"setTitle:",BA.ObjectToString(_pi.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findpifromb4xpage(RemoteObject __ref,RemoteObject _page) throws Exception{
try {
		Debug.PushSubsStack("FindPIFromB4XPage (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,306);
if (RapidSub.canDelegate("findpifromb4xpage")) { return __ref.runUserSub(false, "b4xpagesmanager","findpifromb4xpage", __ref, _page);}
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
Debug.locals.put("Page", _page);
 BA.debugLineNum = 306;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 307;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"Size").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (group1.runMethod(false,"Get:",index1));Debug.locals.put("pi", _pi);
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 308;BA.debugLine="If pi.B4XPage = Page Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pi.getField(false,"B4XPage" /*RemoteObject*/ ),_page)) { 
 BA.debugLineNum = 309;BA.debugLine="Return pi";
Debug.JustUpdateDeviceLine();
if (true) return _pi;
 };
 }
}Debug.locals.put("pi", _pi);
;
 BA.debugLineNum = 312;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (b4i_main.__c.runMethod(false,"Null"));
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpage(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetPage (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,394);
if (RapidSub.canDelegate("getpage")) { return __ref.runUserSub(false, "b4xpagesmanager","getpage", __ref, _id);}
Debug.locals.put("Id", _id);
 BA.debugLineNum = 394;BA.debugLine="Public Sub GetPage (Id As String) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 395;BA.debugLine="Return GetPageFromId(Id).B4XPage";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4i_b4xpagesmanager.class, "_getpagefromid:" /*RemoteObject*/ ,(Object)(_id)).getField(false,"B4XPage" /*RemoteObject*/ );
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpagefromid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetPageFromId (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,398);
if (RapidSub.canDelegate("getpagefromid")) { return __ref.runUserSub(false, "b4xpagesmanager","getpagefromid", __ref, _id);}
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
Debug.locals.put("id", _id);
 BA.debugLineNum = 398;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 399;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
Debug.JustUpdateDeviceLine();
_pi = (__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_get:" /*RemoteObject*/ ,(Object)((_id.runMethod(true,"ToLowerCase")))));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 400;BA.debugLine="If pi = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_pi)) { 
 BA.debugLineNum = 401;BA.debugLine="Log(\"Error: page id not found: \" & id)";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","98847363",RemoteObject.concat(RemoteObject.createImmutable("Error: page id not found: "),_id),0);
 BA.debugLineNum = 402;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","98847364",RemoteObject.concat(RemoteObject.createImmutable("Ids: "),__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_getkeys" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 404;BA.debugLine="Return pi";
Debug.JustUpdateDeviceLine();
if (true) return _pi;
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpageinfofromroot(RemoteObject __ref,RemoteObject _root) throws Exception{
try {
		Debug.PushSubsStack("GetPageInfoFromRoot (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,407);
if (RapidSub.canDelegate("getpageinfofromroot")) { return __ref.runUserSub(false, "b4xpagesmanager","getpageinfofromroot", __ref, _root);}
Debug.locals.put("Root", _root);
 BA.debugLineNum = 407;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 408;BA.debugLine="Return RootB4XToPage.Get(Root)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_rootb4xtopage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_get:" /*RemoteObject*/ ,(Object)(((_root).getObject()))));
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettoppage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTopPage (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,592);
if (RapidSub.canDelegate("gettoppage")) { return __ref.runUserSub(false, "b4xpagesmanager","gettoppage", __ref);}
 BA.debugLineNum = 592;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 593;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return (b4i_main.__c.runMethod(false,"Null"));};
 BA.debugLineNum = 594;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_get:" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_aslist" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))))));
 BA.debugLineNum = 595;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _navcontrol) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,61);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagesmanager","initialize", __ref, _ba, _navcontrol);}
__ref.runVoidMethodAndSync("initializeClassModule");
RemoteObject _nonmainpagewasadded = RemoteObject.createImmutable(false);
Debug.locals.put("ba", _ba);
Debug.locals.put("NavControl", _navcontrol);
 BA.debugLineNum = 61;BA.debugLine="Public Sub Initialize (NavControl As NavigationCon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="IdToB4XPage.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_initialize:" /*RemoteObject*/ ,__ref.getField(false, "bi"));
 BA.debugLineNum = 64;BA.debugLine="RootB4XToPage.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rootb4xtopage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_initialize:" /*RemoteObject*/ ,__ref.getField(false, "bi"));
 BA.debugLineNum = 65;BA.debugLine="mStackOfPageIds.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_initialize:" /*RemoteObject*/ ,__ref.getField(false, "bi"));
 BA.debugLineNum = 76;BA.debugLine="mMainForm = NavControl";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmainform" /*RemoteObject*/ ,_navcontrol);
 BA.debugLineNum = 78;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
Debug.JustUpdateDeviceLine();
b4i_b4xpagesmanager._b4xpages.runVoidMethod ("_internalsetpagesmanager:" /*RemoteObject*/ ,(Object)(__ref));
 BA.debugLineNum = 79;BA.debugLine="MainPage.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xmainpage.class, "_initialize:" /*RemoteObject*/ ,__ref.getField(false, "bi"));
 BA.debugLineNum = 80;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
Debug.JustUpdateDeviceLine();
_nonmainpagewasadded = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0)));Debug.locals.put("NonMainPageWasAdded", _nonmainpagewasadded);Debug.locals.put("NonMainPageWasAdded", _nonmainpagewasadded);
 BA.debugLineNum = 81;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_put::" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("~~~~~temp~~~~"))),(Object)((__ref.runClassMethod (b4i_b4xpagesmanager.class, "_createb4xpageinfo::::" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mainpage" /*RemoteObject*/ ))),(Object)(BA.ObjectToString("")),(Object)(b4i_main.__c.runMethod(true,"False")),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 82;BA.debugLine="BackgroundStateChanged(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_backgroundstatechanged:" /*RemoteObject*/ ,(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 83;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (b4i_b4xorderedmap.class, "_remove:" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("~~~~~temp~~~~"))));
 BA.debugLineNum = 84;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_addpageandcreate::" /*RemoteObject*/ ,(Object)(BA.ObjectToString("MainPage")),(Object)((__ref.getField(false,"_mainpage" /*RemoteObject*/ ))));
 BA.debugLineNum = 85;BA.debugLine="If LogEvents = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_logevents" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 86;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","97536665",RemoteObject.createImmutable("Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events."),0);
 };
 BA.debugLineNum = 88;BA.debugLine="If NonMainPageWasAdded Then";
Debug.JustUpdateDeviceLine();
if (_nonmainpagewasadded.getBoolean()) { 
 BA.debugLineNum = 89;BA.debugLine="If Not(xui.IsB4i) Then";
Debug.JustUpdateDeviceLine();
if (b4i_main.__c.runMethod(true,"Not:",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4i"))).getBoolean()) { 
 BA.debugLineNum = 90;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseevent:::" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ )),(Object)(BA.ObjectToString("B4XPage_Appear")),(Object)((b4i_main.__c.runMethod(false,"Null"))));
 };
 };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logevent(RemoteObject __ref,RemoteObject _pi,RemoteObject _ev) throws Exception{
try {
		Debug.PushSubsStack("LogEvent (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,640);
if (RapidSub.canDelegate("logevent")) { return __ref.runUserSub(false, "b4xpagesmanager","logevent", __ref, _pi, _ev);}
RemoteObject _msg = RemoteObject.createImmutable("");
Debug.locals.put("pi", _pi);
Debug.locals.put("ev", _ev);
 BA.debugLineNum = 640;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 641;BA.debugLine="If LogEvents Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_logevents" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 642;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
Debug.JustUpdateDeviceLine();
_msg = (RemoteObject.concat(RemoteObject.createImmutable("*** "),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((_pi.getField(true,"Id" /*RemoteObject*/ )))),RemoteObject.createImmutable(": "),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((_ev))),RemoteObject.createImmutable(" "),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_stackstring" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("msg", _msg);Debug.locals.put("msg", _msg);
 BA.debugLineNum = 643;BA.debugLine="Log(msg)";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","99568259",_msg,0);
 };
 BA.debugLineNum = 645;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MainForm_Resize (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,585);
if (RapidSub.canDelegate("mainform_resize")) { return __ref.runUserSub(false, "b4xpagesmanager","mainform_resize", __ref, _width, _height);}
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable(0);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 585;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 586;BA.debugLine="Dim w As Int = Width";
Debug.JustUpdateDeviceLine();
_w = BA.numberCast(int.class, _width);Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 587;BA.debugLine="Dim h As Int = Height";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(int.class, _height);Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 588;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseevent:::" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_b4xpagesmanager.class, "_getpageinfofromroot:" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi"))))),(Object)(BA.ObjectToString("B4XPage_Resize")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(_w),(_h)})));
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raiseevent(RemoteObject __ref,RemoteObject _targetpage,RemoteObject _subname,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("RaiseEvent (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,548);
if (RapidSub.canDelegate("raiseevent")) { return __ref.runUserSub(false, "b4xpagesmanager","raiseevent", __ref, _targetpage, _subname, _params);}
RemoteObject _length = RemoteObject.createImmutable(0);
Debug.locals.put("TargetPage", _targetpage);
Debug.locals.put("SubName", _subname);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 548;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 549;BA.debugLine="If TargetPage = Null Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_targetpage)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 550;BA.debugLine="Dim length As Int";
Debug.JustUpdateDeviceLine();
_length = RemoteObject.createImmutable(0);Debug.locals.put("length", _length);
 BA.debugLineNum = 551;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_params)) { 
_length = BA.numberCast(int.class, 0);Debug.locals.put("length", _length);}
else {
_length = _params.getField(true,"Length");Debug.locals.put("length", _length);};
 BA.debugLineNum = 552;BA.debugLine="LogEvent(TargetPage, SubName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_logevent::" /*RemoteObject*/ ,(Object)(_targetpage),(Object)(_subname));
 BA.debugLineNum = 553;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_length)),b4i_main.__c.runMethod(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 554;BA.debugLine="Select length";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_length,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 556;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("CallSubDelayed:::",__ref.getField(false, "bi"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname));
 break; }
case 1: {
 BA.debugLineNum = 558;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("CallSubDelayed2::::",__ref.getField(false, "bi"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_params.runMethod(false,"getObjectFast:", BA.numberCast(int.class, 0))));
 break; }
case 2: {
 BA.debugLineNum = 560;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("CallSubDelayed3:::::",__ref.getField(false, "bi"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_params.runMethod(false,"getObjectFast:", BA.numberCast(int.class, 0))),(Object)(_params.runMethod(false,"getObjectFast:", BA.numberCast(int.class, 1))));
 break; }
default: {
 BA.debugLineNum = 562;BA.debugLine="Log(\"Too many parameters\")";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","99043982",RemoteObject.createImmutable("Too many parameters"),0);
 break; }
}
;
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raiseeventwithresult(RemoteObject __ref,RemoteObject _targetpage,RemoteObject _subname,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("RaiseEventWithResult (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,566);
if (RapidSub.canDelegate("raiseeventwithresult")) { return __ref.runUserSub(false, "b4xpagesmanager","raiseeventwithresult", __ref, _targetpage, _subname, _params);}
RemoteObject _length = RemoteObject.createImmutable(0);
Debug.locals.put("TargetPage", _targetpage);
Debug.locals.put("SubName", _subname);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 566;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 567;BA.debugLine="If TargetPage = Null Then Return Null";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_targetpage)) { 
if (true) return b4i_main.__c.runMethod(false,"Null");};
 BA.debugLineNum = 568;BA.debugLine="Dim length As Int";
Debug.JustUpdateDeviceLine();
_length = RemoteObject.createImmutable(0);Debug.locals.put("length", _length);
 BA.debugLineNum = 569;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_params)) { 
_length = BA.numberCast(int.class, 0);Debug.locals.put("length", _length);}
else {
_length = _params.getField(true,"Length");Debug.locals.put("length", _length);};
 BA.debugLineNum = 570;BA.debugLine="LogEvent(TargetPage, SubName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_logevent::" /*RemoteObject*/ ,(Object)(_targetpage),(Object)(_subname));
 BA.debugLineNum = 571;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_length)),b4i_main.__c.runMethod(true,"False"))) { 
if (true) return b4i_main.__c.runMethod(false,"Null");};
 BA.debugLineNum = 572;BA.debugLine="Select length";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_length,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 574;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
Debug.JustUpdateDeviceLine();
if (true) return b4i_main.__c.runMethodAndSync(false,"CallSub:::",__ref.getField(false, "bi"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname));
 break; }
case 1: {
 BA.debugLineNum = 576;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
Debug.JustUpdateDeviceLine();
if (true) return b4i_main.__c.runMethodAndSync(false,"CallSub2::::",__ref.getField(false, "bi"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_params.runMethod(false,"getObjectFast:", BA.numberCast(int.class, 0))));
 break; }
case 2: {
 BA.debugLineNum = 578;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
Debug.JustUpdateDeviceLine();
if (true) return b4i_main.__c.runMethodAndSync(false,"CallSub3:::::",__ref.getField(false, "bi"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_params.runMethod(false,"getObjectFast:", BA.numberCast(int.class, 0))),(Object)(_params.runMethod(false,"getObjectFast:", BA.numberCast(int.class, 1))));
 break; }
default: {
 BA.debugLineNum = 580;BA.debugLine="Log(\"Too many parameters\")";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","99109518",RemoteObject.createImmutable("Too many parameters"),0);
 break; }
}
;
 BA.debugLineNum = 582;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return b4i_main.__c.runMethod(false,"Null");
 BA.debugLineNum = 583;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _b4xpage,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,363);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "b4xpagesmanager","settitle", __ref, _b4xpage, _title);}
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
Debug.locals.put("B4XPage", _b4xpage);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 363;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 364;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4i_b4xpagesmanager.class, "_findpifromb4xpage:" /*RemoteObject*/ ,(Object)(_b4xpage));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 365;BA.debugLine="pi.Title = Title";
Debug.JustUpdateDeviceLine();
_pi.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 366;BA.debugLine="pi.Parent.NativeType.Title = Title";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"NativeType" /*RemoteObject*/ ).runMethod(true,"setTitle:",BA.ObjectToString(_title));
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpage(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ShowPage (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,156);
if (RapidSub.canDelegate("showpage")) { return __ref.runUserSub(false, "b4xpagesmanager","showpage", __ref, _id);}
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
RemoteObject _index = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Id", _id);
 BA.debugLineNum = 156;BA.debugLine="Public Sub ShowPage (Id As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4i_b4xpagesmanager.class, "_getpagefromid:" /*RemoteObject*/ ,(Object)(_id));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 158;BA.debugLine="If pi = GetTopPage Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pi,__ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 159;BA.debugLine="CreatePageIfNeeded(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_createpageifneeded:" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 160;BA.debugLine="TopPageDisappear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_toppagedisappear" /*RemoteObject*/ );
 BA.debugLineNum = 167;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_contains:" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ )))).getBoolean()) { 
 BA.debugLineNum = 168;BA.debugLine="Dim index As Int = mStackOfPageIds.AsList.IndexO";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_aslist" /*RemoteObject*/ ).runMethod(true,"IndexOf:",(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 169;BA.debugLine="For i = mStackOfPageIds.Size - 1 To index + 1 St";
Debug.JustUpdateDeviceLine();
{
final int step7 = -1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1).<Number>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue() ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 170;BA.debugLine="mStackOfPageIds.Remove(mStackOfPageIds.AsList.G";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_remove:" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_aslist" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 174;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_remove:" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 BA.debugLineNum = 175;BA.debugLine="ShowPageImpl(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_showpageimpl:" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 176;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_add:" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 BA.debugLineNum = 177;BA.debugLine="TopPageAppear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_toppageappear" /*RemoteObject*/ );
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpageandremovepreviouspages(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ShowPageAndRemovePreviousPages (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,180);
if (RapidSub.canDelegate("showpageandremovepreviouspages")) { return __ref.runUserSub(false, "b4xpagesmanager","showpageandremovepreviouspages", __ref, _id);}
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
Debug.locals.put("Id", _id);
 BA.debugLineNum = 180;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="If GetTopPage = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",__ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 182;BA.debugLine="ShowPage(Id)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_showpage:" /*RemoteObject*/ ,(Object)(_id));
 BA.debugLineNum = 183;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 185;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4i_b4xpagesmanager.class, "_getpagefromid:" /*RemoteObject*/ ,(Object)(_id));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 186;BA.debugLine="CreatePageIfNeeded(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_createpageifneeded:" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 187;BA.debugLine="TopPageDisappear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_toppagedisappear" /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="mMainForm.SetPagesStack(Array(pi.Parent.NativeTyp";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mmainform" /*RemoteObject*/ ).runVoidMethod ("SetPagesStack:",(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((_pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"NativeType" /*RemoteObject*/ )).getObject())}))));
 BA.debugLineNum = 201;BA.debugLine="mStackOfPageIds.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 202;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_add:" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 BA.debugLineNum = 203;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4J"))) { 
 BA.debugLineNum = 204;BA.debugLine="ShowPageImpl(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_showpageimpl:" /*RemoteObject*/ ,(Object)(_pi));
 };
 BA.debugLineNum = 206;BA.debugLine="TopPageAppear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_toppageappear" /*RemoteObject*/ );
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpageimpl(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("ShowPageImpl (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,333);
if (RapidSub.canDelegate("showpageimpl")) { return __ref.runUserSub(false, "b4xpagesmanager","showpageimpl", __ref, _pi);}
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 333;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 348;BA.debugLine="mMainForm.ShowPage2(pi.Parent.NativeType, Transit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mmainform" /*RemoteObject*/ ).runVoidMethod ("ShowPage2::",(Object)(((_pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"NativeType" /*RemoteObject*/ )).getObject())),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_transitionanimationduration" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toppageappear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TopPageAppear (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,288);
if (RapidSub.canDelegate("toppageappear")) { return __ref.runUserSub(false, "b4xpagesmanager","toppageappear", __ref);}
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
 BA.debugLineNum = 288;BA.debugLine="Private Sub TopPageAppear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 289;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ );Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 290;BA.debugLine="If pi = Null Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_pi)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 291;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"NativeType" /*RemoteObject*/ ).runMethod(true,"setTitle:",BA.ObjectToString(_pi.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 292;BA.debugLine="If Not(xui.IsB4i) Then";
Debug.JustUpdateDeviceLine();
if (b4i_main.__c.runMethod(true,"Not:",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4i"))).getBoolean()) { 
 BA.debugLineNum = 293;BA.debugLine="If IsForeground Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isforeground" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 294;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseevent:::" /*RemoteObject*/ ,(Object)(_pi),(Object)(BA.ObjectToString("B4XPage_Appear")),(Object)((b4i_main.__c.runMethod(false,"Null"))));
 };
 };
 BA.debugLineNum = 303;BA.debugLine="UpdateStackString";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_updatestackstring" /*RemoteObject*/ );
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toppagedisappear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TopPageDisappear (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,277);
if (RapidSub.canDelegate("toppagedisappear")) { return __ref.runUserSub(false, "b4xpagesmanager","toppagedisappear", __ref);}
RemoteObject _pi = RemoteObject.declareNull("_b4xpageinfo");
 BA.debugLineNum = 277;BA.debugLine="Private Sub TopPageDisappear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 278;BA.debugLine="If xui.IsB4J Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4J").getBoolean()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 279;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4i_b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ );Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 280;BA.debugLine="If pi = Null Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_pi)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 281;BA.debugLine="If Not(xui.IsB4i) Then";
Debug.JustUpdateDeviceLine();
if (b4i_main.__c.runMethod(true,"Not:",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4i"))).getBoolean()) { 
 BA.debugLineNum = 282;BA.debugLine="If IsForeground Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isforeground" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 283;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xpagesmanager.class, "_raiseeventwithresult:::" /*RemoteObject*/ ,(Object)(_pi),(Object)(BA.ObjectToString("B4XPage_Disappear")),(Object)((b4i_main.__c.runMethod(false,"Null"))));
 };
 };
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatestackstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateStackString (b4xpagesmanager) ","b4xpagesmanager",12,__ref.getField(false, "bi"),__ref,647);
if (RapidSub.canDelegate("updatestackstring")) { return __ref.runUserSub(false, "b4xpagesmanager","updatestackstring", __ref);}
RemoteObject _sb = RemoteObject.declareNull("B4IStringBuilder");
RemoteObject _id = RemoteObject.createImmutable("");
 BA.debugLineNum = 647;BA.debugLine="Public Sub UpdateStackString";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 648;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("B4IStringBuilder");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 649;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 650;BA.debugLine="sb.Append(\"[\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append:",(Object)(RemoteObject.createImmutable("[")));
 BA.debugLineNum = 651;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 652;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = __ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (b4i_b4xset.class, "_aslist" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"Size").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.runMethod(false,"Get:",index5));Debug.locals.put("id", _id);
Debug.locals.put("id", _id);
 BA.debugLineNum = 653;BA.debugLine="sb.Append(id).Append(\", \")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append:",(Object)(_id)).runVoidMethod ("Append:",(Object)(RemoteObject.createImmutable(", ")));
 }
}Debug.locals.put("id", _id);
;
 BA.debugLineNum = 655;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Remove::",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"Length"),RemoteObject.createImmutable(2)}, "-",1, 1)),(Object)(_sb.runMethod(true,"Length")));
 };
 BA.debugLineNum = 657;BA.debugLine="sb.Append(\"]\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append:",(Object)(RemoteObject.createImmutable("]")));
 BA.debugLineNum = 658;BA.debugLine="StackString = sb.ToString";
Debug.JustUpdateDeviceLine();
__ref.setField ("_stackstring" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}