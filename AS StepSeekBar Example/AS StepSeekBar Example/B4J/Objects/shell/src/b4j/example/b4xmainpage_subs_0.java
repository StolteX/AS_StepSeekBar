package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _asstepseekbar1_valuechanged(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ASStepSeekBar1_ValueChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("asstepseekbar1_valuechanged")) { return __ref.runUserSub(false, "b4xmainpage","asstepseekbar1_valuechanged", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 38;BA.debugLine="Private Sub ASStepSeekBar1_ValueChanged (Index As";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Log(\"Index: \" & Index)";
Debug.ShouldStop(64);
b4xmainpage.__c.runVoidMethod ("LogImpl","6655361",RemoteObject.concat(RemoteObject.createImmutable("Index: "),_index),0);
 BA.debugLineNum = 40;BA.debugLine="Log(\"Value: \" & Value)";
Debug.ShouldStop(128);
b4xmainpage.__c.runVoidMethod ("LogImpl","6655362",RemoteObject.concat(RemoteObject.createImmutable("Value: "),_value),0);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("ASStepSeekBar2_ValueChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("asstepseekbar2_valuechanged")) { return __ref.runUserSub(false, "b4xmainpage","asstepseekbar2_valuechanged", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 43;BA.debugLine="Private Sub ASStepSeekBar2_ValueChanged (Index As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Log(\"Index: \" & Index)";
Debug.ShouldStop(2048);
b4xmainpage.__c.runVoidMethod ("LogImpl","6720897",RemoteObject.concat(RemoteObject.createImmutable("Index: "),_index),0);
 BA.debugLineNum = 45;BA.debugLine="Log(\"Value: \" & Value)";
Debug.ShouldStop(4096);
b4xmainpage.__c.runVoidMethod ("LogImpl","6720898",RemoteObject.concat(RemoteObject.createImmutable("Value: "),_value),0);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
int _i = 0;
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"frm_main\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frm_main")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="For i = 0 To 4 -1";
Debug.ShouldStop(67108864);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 29;BA.debugLine="ASStepSeekBar1.AddStep2(xui.Color_Red,xui.Color_";
Debug.ShouldStop(268435456);
__ref.getField(false,"_asstepseekbar1" /*RemoteObject*/ ).runClassMethod (b4j.example.asstepseekbar.class, "_addstep2" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Item "),RemoteObject.createImmutable((_i))))));
 BA.debugLineNum = 30;BA.debugLine="ASStepSeekBar2.AddStep2(xui.Color_Red,xui.Color_";
Debug.ShouldStop(536870912);
__ref.getField(false,"_asstepseekbar2" /*RemoteObject*/ ).runClassMethod (b4j.example.asstepseekbar.class, "_addstep2" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Item "),RemoteObject.createImmutable((_i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private ASStepSeekBar1,ASStepSeekBar2 As ASStepSe";
b4xmainpage._asstepseekbar1 = RemoteObject.createNew ("b4j.example.asstepseekbar");__ref.setField("_asstepseekbar1",b4xmainpage._asstepseekbar1);
b4xmainpage._asstepseekbar2 = RemoteObject.createNew ("b4j.example.asstepseekbar");__ref.setField("_asstepseekbar2",b4xmainpage._asstepseekbar2);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
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