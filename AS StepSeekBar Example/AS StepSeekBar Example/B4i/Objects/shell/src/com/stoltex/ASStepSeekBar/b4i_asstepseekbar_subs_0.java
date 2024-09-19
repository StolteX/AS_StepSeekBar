package com.stoltex.ASStepSeekBar;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_asstepseekbar_subs_0 {


public static RemoteObject  _addstep(RemoteObject __ref,RemoteObject _color,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddStep (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,277);
if (RapidSub.canDelegate("addstep")) { return __ref.runUserSub(false, "asstepseekbar","addstep", __ref, _color, _value);}
Debug.locals.put("Color", _color);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 277;BA.debugLine="Public Sub AddStep(Color As Int,Value As Object)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="lst_Sections.Add(CreateASStepSeekBar_Step(Value,C";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runVoidMethod ("Add:",(Object)((__ref.runClassMethod (b4i_asstepseekbar.class, "_createasstepseekbar_step::" /*RemoteObject*/ ,(Object)(_value),(Object)(_color)))));
 BA.debugLineNum = 279;BA.debugLine="Update";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4i_asstepseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,69);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "asstepseekbar","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 69;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="cvs.Resize(Width, Height)";
Debug.ShouldStop(32);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize::",(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 71;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.ShouldStop(64);
__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 72;BA.debugLine="Vertical = mBase.Height > mBase.Width";
Debug.ShouldStop(128);
__ref.setField ("_vertical" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"),BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width")))));
 BA.debugLineNum = 73;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
Debug.ShouldStop(256);
__ref.setField ("_size" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width")))),RemoteObject.createImmutable(2),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-*",1, 0)));
 BA.debugLineNum = 74;BA.debugLine="Update";
Debug.ShouldStop(512);
__ref.runClassMethod (b4i_asstepseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 24;BA.debugLine="Type ASStepSeekBar_Step(Value As Object,Color As";
;
 //BA.debugLineNum = 26;BA.debugLine="Private mEventName As String 'ignore";
b4i_asstepseekbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4i_asstepseekbar._meventname);
 //BA.debugLineNum = 27;BA.debugLine="Private mCallBack As Object 'ignore";
b4i_asstepseekbar._mcallback = RemoteObject.createNew ("NSObject");__ref.setField("_mcallback",b4i_asstepseekbar._mcallback);
 //BA.debugLineNum = 28;BA.debugLine="Public mBase As B4XView 'ignore";
b4i_asstepseekbar._mbase = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbase",b4i_asstepseekbar._mbase);
 //BA.debugLineNum = 29;BA.debugLine="Private xui As XUI 'ignore";
b4i_asstepseekbar._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_asstepseekbar._xui);
 //BA.debugLineNum = 30;BA.debugLine="Public ReachedLineColor, UnreachedLineColor, Thum";
b4i_asstepseekbar._reachedlinecolor = RemoteObject.createImmutable(0);__ref.setField("_reachedlinecolor",b4i_asstepseekbar._reachedlinecolor);
b4i_asstepseekbar._unreachedlinecolor = RemoteObject.createImmutable(0);__ref.setField("_unreachedlinecolor",b4i_asstepseekbar._unreachedlinecolor);
b4i_asstepseekbar._thumbcolor = RemoteObject.createImmutable(0);__ref.setField("_thumbcolor",b4i_asstepseekbar._thumbcolor);
 //BA.debugLineNum = 31;BA.debugLine="Private cvs As B4XCanvas";
b4i_asstepseekbar._cvs = RemoteObject.createNew ("B4XCanvas");__ref.setField("_cvs",b4i_asstepseekbar._cvs);
 //BA.debugLineNum = 32;BA.debugLine="Public Tag As Object";
b4i_asstepseekbar._tag = RemoteObject.createNew ("NSObject");__ref.setField("_tag",b4i_asstepseekbar._tag);
 //BA.debugLineNum = 33;BA.debugLine="Private TouchPanel As B4XView";
b4i_asstepseekbar._touchpanel = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_touchpanel",b4i_asstepseekbar._touchpanel);
 //BA.debugLineNum = 34;BA.debugLine="Private mValue As Int = 0";
b4i_asstepseekbar._mvalue = BA.numberCast(int.class, 0);__ref.setField("_mvalue",b4i_asstepseekbar._mvalue);
 //BA.debugLineNum = 35;BA.debugLine="Private MinValue As Int = 0";
b4i_asstepseekbar._minvalue = BA.numberCast(int.class, 0);__ref.setField("_minvalue",b4i_asstepseekbar._minvalue);
 //BA.debugLineNum = 36;BA.debugLine="Private MaxValue As Int = 100";
b4i_asstepseekbar._maxvalue = BA.numberCast(int.class, 100);__ref.setField("_maxvalue",b4i_asstepseekbar._maxvalue);
 //BA.debugLineNum = 37;BA.debugLine="Public Interval As Int = 1";
b4i_asstepseekbar._interval = BA.numberCast(int.class, 1);__ref.setField("_interval",b4i_asstepseekbar._interval);
 //BA.debugLineNum = 38;BA.debugLine="Private Vertical As Boolean";
b4i_asstepseekbar._vertical = RemoteObject.createImmutable(false);__ref.setField("_vertical",b4i_asstepseekbar._vertical);
 //BA.debugLineNum = 39;BA.debugLine="Public ReachedLineSize = 4dip, UnreachedLineSize";
b4i_asstepseekbar._reachedlinesize = b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 4)));__ref.setField("_reachedlinesize",b4i_asstepseekbar._reachedlinesize);
b4i_asstepseekbar._unreachedlinesize = b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2)));__ref.setField("_unreachedlinesize",b4i_asstepseekbar._unreachedlinesize);
b4i_asstepseekbar._radius1 = b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 6)));__ref.setField("_radius1",b4i_asstepseekbar._radius1);
b4i_asstepseekbar._radius2 = b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 20)));__ref.setField("_radius2",b4i_asstepseekbar._radius2);
 //BA.debugLineNum = 40;BA.debugLine="Private Pressed As Boolean";
b4i_asstepseekbar._pressed = RemoteObject.createImmutable(false);__ref.setField("_pressed",b4i_asstepseekbar._pressed);
 //BA.debugLineNum = 41;BA.debugLine="Private size As Int";
b4i_asstepseekbar._size = RemoteObject.createImmutable(0);__ref.setField("_size",b4i_asstepseekbar._size);
 //BA.debugLineNum = 42;BA.debugLine="Private lst_Sections As List";
b4i_asstepseekbar._lst_sections = RemoteObject.createNew ("B4IList");__ref.setField("_lst_sections",b4i_asstepseekbar._lst_sections);
 //BA.debugLineNum = 43;BA.debugLine="Private lst_X,lst_Y As List";
b4i_asstepseekbar._lst_x = RemoteObject.createNew ("B4IList");__ref.setField("_lst_x",b4i_asstepseekbar._lst_x);
b4i_asstepseekbar._lst_y = RemoteObject.createNew ("B4IList");__ref.setField("_lst_y",b4i_asstepseekbar._lst_y);
 //BA.debugLineNum = 44;BA.debugLine="Private m_Index As Int = 0";
b4i_asstepseekbar._m_index = BA.numberCast(int.class, 0);__ref.setField("_m_index",b4i_asstepseekbar._m_index);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,282);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "asstepseekbar","clear", __ref);}
 BA.debugLineNum = 282;BA.debugLine="Public Sub Clear";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="lst_Sections.Clear";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createasstepseekbar_step(RemoteObject __ref,RemoteObject _value,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("CreateASStepSeekBar_Step (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,286);
if (RapidSub.canDelegate("createasstepseekbar_step")) { return __ref.runUserSub(false, "asstepseekbar","createasstepseekbar_step", __ref, _value, _color);}
RemoteObject _t1 = RemoteObject.declareNull("_asstepseekbar_step");
Debug.locals.put("Value", _value);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 286;BA.debugLine="Public Sub CreateASStepSeekBar_Step (Value As Obje";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="Dim t1 As ASStepSeekBar_Step";
Debug.ShouldStop(1073741824);
_t1 = RemoteObject.createNew ("_asstepseekbar_step");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 288;BA.debugLine="t1.Initialize";
Debug.ShouldStop(-2147483648);
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 289;BA.debugLine="t1.Value = Value";
Debug.ShouldStop(1);
_t1.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 290;BA.debugLine="t1.Color = Color";
Debug.ShouldStop(2);
_t1.setField ("Color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 291;BA.debugLine="Return t1";
Debug.ShouldStop(4);
if (true) return _t1;
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,55);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "asstepseekbar","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 55;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="mBase = Base";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 57;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.ShouldStop(16777216);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"Tag"));
 BA.debugLineNum = 57;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag:",__ref);
 BA.debugLineNum = 58;BA.debugLine="ReachedLineColor = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(33554432);
__ref.setField ("_reachedlinecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor:",(Object)(_props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("ReachedLineColor")))))));
 BA.debugLineNum = 59;BA.debugLine="UnreachedLineColor = xui.PaintOrColorToColor(Prop";
Debug.ShouldStop(67108864);
__ref.setField ("_unreachedlinecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor:",(Object)(_props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("UnreachedLineColor")))))));
 BA.debugLineNum = 60;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
Debug.ShouldStop(134217728);
__ref.setField ("_thumbcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor:",(Object)(_props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("ThumbColor")))))));
 BA.debugLineNum = 61;BA.debugLine="cvs.Initialize(mBase)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize:",(Object)(((__ref.getField(false,"_mbase" /*RemoteObject*/ )).getObject())));
 BA.debugLineNum = 62;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
Debug.ShouldStop(536870912);
__ref.setField ("_touchpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("TouchPanel"))));
 BA.debugLineNum = 63;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_touchpanel" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,269);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "asstepseekbar","getsize", __ref);}
 BA.debugLineNum = 269;BA.debugLine="Public Sub getSize As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Return lst_Sections.Size";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"Size");
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstepindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getStepIndex (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,263);
if (RapidSub.canDelegate("getstepindex")) { return __ref.runUserSub(false, "asstepseekbar","getstepindex", __ref);}
 BA.debugLineNum = 263;BA.debugLine="Public Sub getStepIndex As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="Return m_Index";
Debug.ShouldStop(128);
if (true) return __ref.getField(true,"_m_index" /*RemoteObject*/ );
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstepvalue(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetStepValue (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,273);
if (RapidSub.canDelegate("getstepvalue")) { return __ref.runUserSub(false, "asstepseekbar","getstepvalue", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 273;BA.debugLine="Public Sub GetStepValue(Index As Int) As Object";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="Return lst_Sections.Get(Index).As(ASStepSeekBar_S";
Debug.ShouldStop(131072);
if (true) return ((__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_index)))).getField(false,"Value" /*RemoteObject*/ );
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,47);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "asstepseekbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 47;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(32768);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 49;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(65536);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 50;BA.debugLine="lst_Sections.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raisetouchstateevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseTouchStateEvent (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,209);
if (RapidSub.canDelegate("raisetouchstateevent")) { return __ref.runUserSub(false, "asstepseekbar","raisetouchstateevent", __ref);}
 BA.debugLineNum = 209;BA.debugLine="Private Sub RaiseTouchStateEvent";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchStateChanged"))),(Object)(BA.numberCast(int.class, 1))).getBoolean()) { 
 BA.debugLineNum = 211;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
Debug.ShouldStop(262144);
b4i_main.__c.runVoidMethod ("CallSubDelayed2::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchStateChanged"))),(Object)((__ref.getField(true,"_pressed" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstepindex(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("setStepIndex (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,253);
if (RapidSub.canDelegate("setstepindex")) { return __ref.runUserSub(false, "asstepseekbar","setstepindex", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 253;BA.debugLine="Public Sub setStepIndex(Index As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 255;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 256;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(Index) , 0)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4i_asstepseekbar.class, "_setvaluebasedontouch::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_index)))),(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 258;BA.debugLine="SetValueBasedOnTouch(0 ,lst_Y.Get(Index))";
Debug.ShouldStop(2);
__ref.runClassMethod (b4i_asstepseekbar.class, "_setvaluebasedontouch::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_index)))));
 };
 BA.debugLineNum = 260;BA.debugLine="Update";
Debug.ShouldStop(8);
__ref.runClassMethod (b4i_asstepseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvaluebasedontouch(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetValueBasedOnTouch (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,215);
if (RapidSub.canDelegate("setvaluebasedontouch")) { return __ref.runUserSub(false, "asstepseekbar","setvaluebasedontouch", __ref, _x, _y);}
RemoteObject _v = RemoteObject.createImmutable(0);
RemoteObject _newvalue = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _section = RemoteObject.declareNull("_asstepseekbar_step");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 215;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="Dim v As Int";
Debug.ShouldStop(8388608);
_v = RemoteObject.createImmutable(0);Debug.locals.put("v", _v);
 BA.debugLineNum = 217;BA.debugLine="If Vertical Then";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_vertical" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 218;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
Debug.ShouldStop(33554432);
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"),__ref.getField(true,"_radius2" /*RemoteObject*/ ),_y}, "--",2, 0)),__ref.getField(true,"_size" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "/*+",1, 0));Debug.locals.put("v", _v);
 }else {
 BA.debugLineNum = 220;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
Debug.ShouldStop(134217728);
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_size" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "/*+",1, 0));Debug.locals.put("v", _v);
 };
 BA.debugLineNum = 222;BA.debugLine="v = Round (v / Interval) * Interval";
Debug.ShouldStop(536870912);
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Round:",(Object)(RemoteObject.solve(new RemoteObject[] {_v,__ref.getField(true,"_interval" /*RemoteObject*/ )}, "/",0, 0))),__ref.getField(true,"_interval" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("v", _v);
 BA.debugLineNum = 223;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
Debug.ShouldStop(1073741824);
_newvalue = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_minvalue" /*RemoteObject*/ ))),(Object)(b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxvalue" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _v))))));Debug.locals.put("NewValue", _newvalue);Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 224;BA.debugLine="If NewValue <> mValue Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_newvalue,BA.numberCast(double.class, __ref.getField(true,"_mvalue" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 225;BA.debugLine="mValue = NewValue";
Debug.ShouldStop(1);
__ref.setField ("_mvalue" /*RemoteObject*/ ,_newvalue);
 BA.debugLineNum = 227;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 228;BA.debugLine="For i = 0 To lst_X.Size -1";
Debug.ShouldStop(8);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 229;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 230;BA.debugLine="m_Index = i";
Debug.ShouldStop(32);
__ref.setField ("_m_index" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 231;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
Debug.ShouldStop(64);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)(BA.numberCast(int.class, 2))).getBoolean()) { 
 BA.debugLineNum = 232;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
Debug.ShouldStop(128);
_section = (__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("section", _section);Debug.locals.put("section", _section);
 BA.debugLineNum = 233;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethod ("CallSubDelayed3:::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)(RemoteObject.createImmutable((_i))),(Object)(_section.getField(false,"Value" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 235;BA.debugLine="Exit";
Debug.ShouldStop(1024);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 239;BA.debugLine="For i = 0 To lst_Y.Size -1";
Debug.ShouldStop(16384);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 240;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 241;BA.debugLine="m_Index = i";
Debug.ShouldStop(65536);
__ref.setField ("_m_index" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 242;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)(BA.numberCast(int.class, 2))).getBoolean()) { 
 BA.debugLineNum = 243;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
Debug.ShouldStop(262144);
_section = (__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("section", _section);Debug.locals.put("section", _section);
 BA.debugLineNum = 244;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
Debug.ShouldStop(524288);
b4i_main.__c.runVoidMethod ("CallSubDelayed3:::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)(RemoteObject.createImmutable((_i))),(Object)(_section.getField(false,"Value" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 246;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchpanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("TouchPanel_Touch (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,150);
if (RapidSub.canDelegate("touchpanel_touch")) { return __ref.runUserSub(false, "asstepseekbar","touchpanel_touch", __ref, _action, _x, _y);}
int _i = 0;
RemoteObject _thisindex = RemoteObject.createImmutable(0);
RemoteObject _itemwidth = RemoteObject.createImmutable(0.0f);
RemoteObject _itemheight = RemoteObject.createImmutable(0.0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 150;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runMethod(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 152;BA.debugLine="Pressed = True";
Debug.ShouldStop(8388608);
__ref.setField ("_pressed" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 153;BA.debugLine="RaiseTouchStateEvent";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4i_asstepseekbar.class, "_raisetouchstateevent" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 155;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_MOVE The";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runMethod(true,"TOUCH_ACTION_MOVE")))) { 
 BA.debugLineNum = 157;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 158;BA.debugLine="For i = 0 To lst_X.Size -1";
Debug.ShouldStop(536870912);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 159;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 160;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(i) , Y)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4i_asstepseekbar.class, "_setvaluebasedontouch::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))))),(Object)(BA.numberCast(int.class, _y)));
 BA.debugLineNum = 161;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 165;BA.debugLine="For i = 0 To lst_Y.Size -1";
Debug.ShouldStop(16);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 166;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 167;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(i))";
Debug.ShouldStop(64);
__ref.runClassMethod (b4i_asstepseekbar.class, "_setvaluebasedontouch::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 168;BA.debugLine="Exit";
Debug.ShouldStop(128);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 };
 }else 
{ BA.debugLineNum = 173;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_UP Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runMethod(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 174;BA.debugLine="Pressed = False";
Debug.ShouldStop(8192);
__ref.setField ("_pressed" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 175;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 176;BA.debugLine="Dim ThisIndex As Int = 0";
Debug.ShouldStop(32768);
_thisindex = BA.numberCast(int.class, 0);Debug.locals.put("ThisIndex", _thisindex);Debug.locals.put("ThisIndex", _thisindex);
 BA.debugLineNum = 177;BA.debugLine="Dim ItemWidth As Float = (mBase.Width/lst_X.Siz";
Debug.ShouldStop(65536);
_itemwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width"),__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(true,"Size")}, "/",0, 0)),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("ItemWidth", _itemwidth);Debug.locals.put("ItemWidth", _itemwidth);
 BA.debugLineNum = 178;BA.debugLine="For i = 0 To lst_X.Size -1";
Debug.ShouldStop(131072);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 179;BA.debugLine="If Round(x) >= Round((lst_X.Get(i) - (ItemWidt";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("g",b4i_main.__c.runMethod(true,"Round:",(Object)(BA.numberCast(double.class, _x))),b4i_main.__c.runMethod(true,"Round:",(Object)((RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),(RemoteObject.solve(new RemoteObject[] {_itemwidth,RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))))) && RemoteObject.solveBoolean("k",b4i_main.__c.runMethod(true,"Round:",(Object)(BA.numberCast(double.class, _x))),b4i_main.__c.runMethod(true,"Round:",(Object)((RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),(RemoteObject.solve(new RemoteObject[] {_itemwidth,RemoteObject.createImmutable(2)}, "/",0, 0))}, "+",1, 0)))))) { 
 BA.debugLineNum = 180;BA.debugLine="ThisIndex = i";
Debug.ShouldStop(524288);
_thisindex = BA.numberCast(int.class, _i);Debug.locals.put("ThisIndex", _thisindex);
 BA.debugLineNum = 181;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 188;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(ThisIndex) , Y)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4i_asstepseekbar.class, "_setvaluebasedontouch::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_thisindex)))),(Object)(BA.numberCast(int.class, _y)));
 }else {
 BA.debugLineNum = 190;BA.debugLine="Dim ThisIndex As Int = 0";
Debug.ShouldStop(536870912);
_thisindex = BA.numberCast(int.class, 0);Debug.locals.put("ThisIndex", _thisindex);Debug.locals.put("ThisIndex", _thisindex);
 BA.debugLineNum = 191;BA.debugLine="Dim ItemHeight As Float = mBase.Height/lst_Y.Si";
Debug.ShouldStop(1073741824);
_itemheight = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"),__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(true,"Size")}, "/",0, 0));Debug.locals.put("ItemHeight", _itemheight);Debug.locals.put("ItemHeight", _itemheight);
 BA.debugLineNum = 192;BA.debugLine="For i = 0 To lst_Y.Size -1";
Debug.ShouldStop(-2147483648);
{
final int step35 = 1;
final int limit35 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step35 > 0 && _i <= limit35) || (step35 < 0 && _i >= limit35) ;_i = ((int)(0 + _i + step35))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 193;BA.debugLine="If Round(y) >= Round((lst_y.Get(i) - (Itemheig";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",b4i_main.__c.runMethod(true,"Round:",(Object)(BA.numberCast(double.class, _y))),b4i_main.__c.runMethod(true,"Round:",(Object)((RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),(RemoteObject.solve(new RemoteObject[] {_itemheight,RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))))) && RemoteObject.solveBoolean("k",b4i_main.__c.runMethod(true,"Round:",(Object)(BA.numberCast(double.class, _y))),b4i_main.__c.runMethod(true,"Round:",(Object)((RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),(RemoteObject.solve(new RemoteObject[] {_itemheight,RemoteObject.createImmutable(2)}, "/",0, 0))}, "+",1, 0)))))) { 
 BA.debugLineNum = 194;BA.debugLine="ThisIndex = i";
Debug.ShouldStop(2);
_thisindex = BA.numberCast(int.class, _i);Debug.locals.put("ThisIndex", _thisindex);
 BA.debugLineNum = 195;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 202;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(ThisIndex))";
Debug.ShouldStop(512);
__ref.runClassMethod (b4i_asstepseekbar.class, "_setvaluebasedontouch::" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_thisindex)))));
 };
 BA.debugLineNum = 204;BA.debugLine="RaiseTouchStateEvent";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4i_asstepseekbar.class, "_raisetouchstateevent" /*RemoteObject*/ );
 }}}
;
 BA.debugLineNum = 206;BA.debugLine="Update";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4i_asstepseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Update (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "bi"),__ref,78);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "asstepseekbar","update", __ref);}
RemoteObject _s1 = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _tmp_width = RemoteObject.createImmutable(0.0f);
RemoteObject _newx = RemoteObject.createImmutable(0.0f);
RemoteObject _section = RemoteObject.declareNull("_asstepseekbar_step");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _tmp_height = RemoteObject.createImmutable(0.0f);
RemoteObject _newy = RemoteObject.createImmutable(0.0f);
 BA.debugLineNum = 78;BA.debugLine="Public Sub Update";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.ShouldStop(32768);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect:",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"TargetRect")));
 BA.debugLineNum = 81;BA.debugLine="If size > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_size" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 82;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 83;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
Debug.ShouldStop(262144);
_s1 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_size" /*RemoteObject*/ )}, "+/*",1, 0));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 84;BA.debugLine="Dim y As Int = mBase.Height / 2";
Debug.ShouldStop(524288);
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 85;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, ReachedLineColo";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(__ref.getField(true,"_reachedlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_reachedlinesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 86;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, U";
Debug.ShouldStop(2097152);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width"),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))),(Object)(BA.numberCast(float.class, _y)),(Object)(__ref.getField(true,"_unreachedlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_unreachedlinesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 88;BA.debugLine="lst_X.Clear";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 90;BA.debugLine="For i = 0 To lst_Sections.Size -1";
Debug.ShouldStop(33554432);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 92;BA.debugLine="Dim tmp_width As Float = (mBase.Width - Radius";
Debug.ShouldStop(134217728);
_tmp_width = BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width"),__ref.getField(true,"_radius2" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 0)));Debug.locals.put("tmp_width", _tmp_width);Debug.locals.put("tmp_width", _tmp_width);
 BA.debugLineNum = 94;BA.debugLine="Dim newx As Float = 0";
Debug.ShouldStop(536870912);
_newx = BA.numberCast(float.class, 0);Debug.locals.put("newx", _newx);Debug.locals.put("newx", _newx);
 BA.debugLineNum = 95;BA.debugLine="If i = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 96;BA.debugLine="newx = Radius2";
Debug.ShouldStop(-2147483648);
_newx = BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ));Debug.locals.put("newx", _newx);
 }else 
{ BA.debugLineNum = 97;BA.debugLine="Else if i = (lst_Sections.Size -1) Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 98;BA.debugLine="newx = tmp_width + Radius2";
Debug.ShouldStop(2);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tmp_width,__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("newx", _newx);
 }else {
 BA.debugLineNum = 100;BA.debugLine="newx = (tmp_width/(lst_Sections.Size -1)) * i";
Debug.ShouldStop(8);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_tmp_width,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "/",0, 0)),RemoteObject.createImmutable(_i),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "*+",1, 0));Debug.locals.put("newx", _newx);
 }}
;
 BA.debugLineNum = 102;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
Debug.ShouldStop(32);
_section = (__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Section", _section);Debug.locals.put("Section", _section);
 BA.debugLineNum = 103;BA.debugLine="cvs.DrawCircle(newx,mBase.Height/2,Radius1,Sec";
Debug.ShouldStop(64);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle::::::",(Object)(_newx),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius1" /*RemoteObject*/ ))),(Object)(_section.getField(true,"Color" /*RemoteObject*/ )),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 104;BA.debugLine="lst_X.Add(newx)";
Debug.ShouldStop(128);
__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runVoidMethod ("Add:",(Object)((_newx)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 108;BA.debugLine="cvs.DrawCircle(s1, y, Radius2/2, ReachedLineCol";
Debug.ShouldStop(2048);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle::::::",(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(true,"_reachedlinecolor" /*RemoteObject*/ )),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 110;BA.debugLine="If Pressed Then";
Debug.ShouldStop(8192);
if (__ref.getField(true,"_pressed" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 111;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
Debug.ShouldStop(16384);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle::::::",(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_thumbcolor" /*RemoteObject*/ )),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 };
 }else {
 BA.debugLineNum = 114;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
Debug.ShouldStop(131072);
_s1 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "--",2, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_size" /*RemoteObject*/ )}, "+/*",1, 0));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 115;BA.debugLine="Dim x As Int = mBase.Width / 2";
Debug.ShouldStop(262144);
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 116;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, UnreachedLineCo";
Debug.ShouldStop(524288);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(__ref.getField(true,"_unreachedlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_unreachedlinesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 117;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))),(Object)(__ref.getField(true,"_reachedlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_reachedlinesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 119;BA.debugLine="lst_Y.Clear";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 122;BA.debugLine="For i = 0 To lst_Sections.Size -1";
Debug.ShouldStop(33554432);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33) ;_i = ((int)(0 + _i + step33))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 124;BA.debugLine="Dim tmp_height As Float = (mBase.Height - Radi";
Debug.ShouldStop(134217728);
_tmp_height = BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"),__ref.getField(true,"_radius2" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 0)));Debug.locals.put("tmp_height", _tmp_height);Debug.locals.put("tmp_height", _tmp_height);
 BA.debugLineNum = 126;BA.debugLine="Dim newy As Float = 0";
Debug.ShouldStop(536870912);
_newy = BA.numberCast(float.class, 0);Debug.locals.put("newy", _newy);Debug.locals.put("newy", _newy);
 BA.debugLineNum = 127;BA.debugLine="If i = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 128;BA.debugLine="newy = Radius2";
Debug.ShouldStop(-2147483648);
_newy = BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ));Debug.locals.put("newy", _newy);
 }else 
{ BA.debugLineNum = 129;BA.debugLine="Else if i = (lst_Sections.Size -1) Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 130;BA.debugLine="newy = tmp_height + Radius2";
Debug.ShouldStop(2);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tmp_height,__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("newy", _newy);
 }else {
 BA.debugLineNum = 132;BA.debugLine="newy = (tmp_height/(lst_Sections.Size -1)) *";
Debug.ShouldStop(8);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_tmp_height,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "/",0, 0)),RemoteObject.createImmutable(_i),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "*+",1, 0));Debug.locals.put("newy", _newy);
 }}
;
 BA.debugLineNum = 134;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
Debug.ShouldStop(32);
_section = (__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Section", _section);Debug.locals.put("Section", _section);
 BA.debugLineNum = 135;BA.debugLine="cvs.DrawCircle(mBase.Width/2,newy,Radius1,Sect";
Debug.ShouldStop(64);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_newy),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius1" /*RemoteObject*/ ))),(Object)(_section.getField(true,"Color" /*RemoteObject*/ )),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 136;BA.debugLine="lst_Y.Add(newy)";
Debug.ShouldStop(128);
__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runVoidMethod ("Add:",(Object)((_newy)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 140;BA.debugLine="cvs.DrawCircle(x, s1, Radius2/2, ReachedLineCol";
Debug.ShouldStop(2048);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle::::::",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(true,"_reachedlinecolor" /*RemoteObject*/ )),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 142;BA.debugLine="If Pressed Then";
Debug.ShouldStop(8192);
if (__ref.getField(true,"_pressed" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 143;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
Debug.ShouldStop(16384);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle::::::",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_thumbcolor" /*RemoteObject*/ )),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 };
 };
 };
 BA.debugLineNum = 147;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(262144);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}