package com.stoltex.ASStepSeekBar;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_b4xmainpage_subs_0 {


public static RemoteObject  _asstepseekbar1_valuechanged(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ASStepSeekBar1_ValueChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,37);
if (RapidSub.canDelegate("asstepseekbar1_valuechanged")) { return __ref.runUserSub(false, "b4xmainpage","asstepseekbar1_valuechanged", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 37;BA.debugLine="Private Sub ASStepSeekBar1_ValueChanged (Index As";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Log(\"Index: \" & Index)";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethod ("LogImpl:::","2458753",RemoteObject.concat(RemoteObject.createImmutable("Index: "),_index),0);
 BA.debugLineNum = 39;BA.debugLine="Log(\"Value: \" & Value)";
Debug.ShouldStop(64);
b4i_main.__c.runVoidMethod ("LogImpl:::","2458754",RemoteObject.concat(RemoteObject.createImmutable("Value: "),_value),0);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asstepseekbar2_valuechanged(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ASStepSeekBar2_ValueChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,42);
if (RapidSub.canDelegate("asstepseekbar2_valuechanged")) { return __ref.runUserSub(false, "b4xmainpage","asstepseekbar2_valuechanged", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 42;BA.debugLine="Private Sub ASStepSeekBar2_ValueChanged (Index As";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Log(\"Index: \" & Index)";
Debug.ShouldStop(1024);
b4i_main.__c.runVoidMethod ("LogImpl:::","2524289",RemoteObject.concat(RemoteObject.createImmutable("Index: "),_index),0);
 BA.debugLineNum = 44;BA.debugLine="Log(\"Value: \" & Value)";
Debug.ShouldStop(2048);
b4i_main.__c.runVoidMethod ("LogImpl:::","2524290",RemoteObject.concat(RemoteObject.createImmutable("Value: "),_value),0);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1); return;}
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(null,__ref,_root1);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(b4i_b4xmainpage parent,RemoteObject __ref,RemoteObject _root1) {
this.parent = parent;
this.__ref = __ref;
this._root1 = _root1;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4i_b4xmainpage parent;
RemoteObject _root1;
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
int _i = 0;
int step4;
int limit4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,19);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"frm_main\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout::",(Object)(RemoteObject.createImmutable("frm_main")),__ref.getField(false, "bi"));
 BA.debugLineNum = 24;BA.debugLine="Wait For B4XPage_Resize (Width As Int, Height As";
Debug.ShouldStop(8388608);
b4i_main.__c.runVoidMethod ("WaitFor::::","b4xpage_resize::", __ref.getField(false, "bi"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "b4xpage_created"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_width = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(1));Debug.locals.put("Width", _width);
_height = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(2));Debug.locals.put("Height", _height);
;
 BA.debugLineNum = 27;BA.debugLine="For i = 0 To 4 -1";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//for
this.state = 4;
step4 = 1;
limit4 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 6;
if (true) break;

case 6:
//C
this.state = 4;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 7:
//C
this.state = 6;
_i = ((int)(0 + _i + step4)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 7;
 BA.debugLineNum = 28;BA.debugLine="ASStepSeekBar1.AddStep(xui.Color_White,\"Item \" &";
Debug.ShouldStop(134217728);
__ref.getField(false,"_asstepseekbar1" /*RemoteObject*/ ).runClassMethod (b4i_asstepseekbar.class, "_addstep::" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Item "),RemoteObject.createImmutable((_i))))));
 BA.debugLineNum = 29;BA.debugLine="ASStepSeekBar2.AddStep(xui.Color_White,\"Item \" &";
Debug.ShouldStop(268435456);
__ref.getField(false,"_asstepseekbar2" /*RemoteObject*/ ).runClassMethod (b4i_asstepseekbar.class, "_addstep::" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Item "),RemoteObject.createImmutable((_i))))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _b4xpage_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4i_b4xmainpage._root = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_root",b4i_b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4i_b4xmainpage._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private ASStepSeekBar1,ASStepSeekBar2 As ASStepSe";
b4i_b4xmainpage._asstepseekbar1 = RemoteObject.createNew ("b4i_asstepseekbar");__ref.setField("_asstepseekbar1",b4i_b4xmainpage._asstepseekbar1);
b4i_b4xmainpage._asstepseekbar2 = RemoteObject.createNew ("b4i_asstepseekbar");__ref.setField("_asstepseekbar2",b4i_b4xmainpage._asstepseekbar2);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "bi"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}