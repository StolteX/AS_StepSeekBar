package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class asstepseekbar_subs_0 {


public static RemoteObject  _addstep(RemoteObject __ref,RemoteObject _color,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddStep (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("addstep")) { return __ref.runUserSub(false, "asstepseekbar","addstep", __ref, _color, _value);}
Debug.locals.put("Color", _color);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 252;BA.debugLine="Public Sub AddStep(Color As Int,Value As Object)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="lst_Sections.Add(CreateASStepSeekBar_Step(Value,C";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.asstepseekbar.class, "_createasstepseekbar_step" /*RemoteObject*/ ,(Object)(_value),(Object)(_color)))));
 BA.debugLineNum = 254;BA.debugLine="Update";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Base_Resize (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "asstepseekbar","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 62;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="cvs.Resize(Width, Height)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 64;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 65;BA.debugLine="Vertical = mBase.Height > mBase.Width";
Debug.ShouldStop(1);
__ref.setField ("_vertical" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")))));
 BA.debugLineNum = 66;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
Debug.ShouldStop(2);
__ref.setField ("_size" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {asstepseekbar.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")))),RemoteObject.createImmutable(2),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-*",1, 0)));
 BA.debugLineNum = 67;BA.debugLine="Update";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Type ASStepSeekBar_Step(Value As Object,Color As";
;
 //BA.debugLineNum = 20;BA.debugLine="Private mEventName As String 'ignore";
asstepseekbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",asstepseekbar._meventname);
 //BA.debugLineNum = 21;BA.debugLine="Private mCallBack As Object 'ignore";
asstepseekbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",asstepseekbar._mcallback);
 //BA.debugLineNum = 22;BA.debugLine="Public mBase As B4XView 'ignore";
asstepseekbar._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",asstepseekbar._mbase);
 //BA.debugLineNum = 23;BA.debugLine="Private xui As XUI 'ignore";
asstepseekbar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",asstepseekbar._xui);
 //BA.debugLineNum = 24;BA.debugLine="Public ReachedLineColor, UnreachedLineColor, Thum";
asstepseekbar._reachedlinecolor = RemoteObject.createImmutable(0);__ref.setField("_reachedlinecolor",asstepseekbar._reachedlinecolor);
asstepseekbar._unreachedlinecolor = RemoteObject.createImmutable(0);__ref.setField("_unreachedlinecolor",asstepseekbar._unreachedlinecolor);
asstepseekbar._thumbcolor = RemoteObject.createImmutable(0);__ref.setField("_thumbcolor",asstepseekbar._thumbcolor);
 //BA.debugLineNum = 25;BA.debugLine="Private cvs As B4XCanvas";
asstepseekbar._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",asstepseekbar._cvs);
 //BA.debugLineNum = 26;BA.debugLine="Public Tag As Object";
asstepseekbar._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",asstepseekbar._tag);
 //BA.debugLineNum = 27;BA.debugLine="Private TouchPanel As B4XView";
asstepseekbar._touchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_touchpanel",asstepseekbar._touchpanel);
 //BA.debugLineNum = 28;BA.debugLine="Private mValue As Int = 0";
asstepseekbar._mvalue = BA.numberCast(int.class, 0);__ref.setField("_mvalue",asstepseekbar._mvalue);
 //BA.debugLineNum = 29;BA.debugLine="Private MinValue As Int = 0";
asstepseekbar._minvalue = BA.numberCast(int.class, 0);__ref.setField("_minvalue",asstepseekbar._minvalue);
 //BA.debugLineNum = 30;BA.debugLine="Private MaxValue As Int = 100";
asstepseekbar._maxvalue = BA.numberCast(int.class, 100);__ref.setField("_maxvalue",asstepseekbar._maxvalue);
 //BA.debugLineNum = 31;BA.debugLine="Public Interval As Int = 1";
asstepseekbar._interval = BA.numberCast(int.class, 1);__ref.setField("_interval",asstepseekbar._interval);
 //BA.debugLineNum = 32;BA.debugLine="Private Vertical As Boolean";
asstepseekbar._vertical = RemoteObject.createImmutable(false);__ref.setField("_vertical",asstepseekbar._vertical);
 //BA.debugLineNum = 33;BA.debugLine="Public ReachedLineSize = 4dip, UnreachedLineSize";
asstepseekbar._reachedlinesize = asstepseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)));__ref.setField("_reachedlinesize",asstepseekbar._reachedlinesize);
asstepseekbar._unreachedlinesize = asstepseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));__ref.setField("_unreachedlinesize",asstepseekbar._unreachedlinesize);
asstepseekbar._radius1 = asstepseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6)));__ref.setField("_radius1",asstepseekbar._radius1);
asstepseekbar._radius2 = asstepseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)));__ref.setField("_radius2",asstepseekbar._radius2);
 //BA.debugLineNum = 34;BA.debugLine="Private Pressed As Boolean";
asstepseekbar._pressed = RemoteObject.createImmutable(false);__ref.setField("_pressed",asstepseekbar._pressed);
 //BA.debugLineNum = 35;BA.debugLine="Private size As Int";
asstepseekbar._size = RemoteObject.createImmutable(0);__ref.setField("_size",asstepseekbar._size);
 //BA.debugLineNum = 36;BA.debugLine="Private lst_Sections As List";
asstepseekbar._lst_sections = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lst_sections",asstepseekbar._lst_sections);
 //BA.debugLineNum = 37;BA.debugLine="Private lst_X,lst_Y As List";
asstepseekbar._lst_x = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lst_x",asstepseekbar._lst_x);
asstepseekbar._lst_y = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lst_y",asstepseekbar._lst_y);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createasstepseekbar_step(RemoteObject __ref,RemoteObject _value,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("CreateASStepSeekBar_Step (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("createasstepseekbar_step")) { return __ref.runUserSub(false, "asstepseekbar","createasstepseekbar_step", __ref, _value, _color);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.asstepseekbar._asstepseekbar_step");
Debug.locals.put("Value", _value);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 257;BA.debugLine="Public Sub CreateASStepSeekBar_Step (Value As Obje";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="Dim t1 As ASStepSeekBar_Step";
Debug.ShouldStop(2);
_t1 = RemoteObject.createNew ("b4a.example.asstepseekbar._asstepseekbar_step");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 259;BA.debugLine="t1.Initialize";
Debug.ShouldStop(4);
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 260;BA.debugLine="t1.Value = Value";
Debug.ShouldStop(8);
_t1.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 261;BA.debugLine="t1.Color = Color";
Debug.ShouldStop(16);
_t1.setField ("Color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 262;BA.debugLine="Return t1";
Debug.ShouldStop(32);
if (true) return _t1;
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("DesignerCreateView (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "asstepseekbar","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 48;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="mBase = Base";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 50;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.ShouldStop(131072);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 50;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.ShouldStop(131072);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 51;BA.debugLine="ReachedLineColor = xui.PaintOrColorToColor(Props.";
Debug.ShouldStop(262144);
__ref.setField ("_reachedlinecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReachedLineColor")))))));
 BA.debugLineNum = 52;BA.debugLine="UnreachedLineColor = xui.PaintOrColorToColor(Prop";
Debug.ShouldStop(524288);
__ref.setField ("_unreachedlinecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UnreachedLineColor")))))));
 BA.debugLineNum = 53;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
Debug.ShouldStop(1048576);
__ref.setField ("_thumbcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ThumbColor")))))));
 BA.debugLineNum = 54;BA.debugLine="cvs.Initialize(mBase)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
Debug.ShouldStop(4194304);
__ref.setField ("_touchpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TouchPanel"))));
 BA.debugLineNum = 56;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 58;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("getSize (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "asstepseekbar","getsize", __ref);}
 BA.debugLineNum = 240;BA.debugLine="Public Sub getSize As Int";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="Return lst_Sections.Size";
Debug.ShouldStop(65536);
if (true) return __ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("GetStepValue (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("getstepvalue")) { return __ref.runUserSub(false, "asstepseekbar","getstepvalue", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 244;BA.debugLine="Public Sub GetStepValue(Index As Int) As Object";
Debug.ShouldStop(524288);
 BA.debugLineNum = 245;BA.debugLine="Return lst_Sections.Get(Index).As(ASStepSeekBar_S";
Debug.ShouldStop(1048576);
if (true) return ((__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)))).getField(false,"Value" /*RemoteObject*/ );
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Initialize (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "asstepseekbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 40;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(256);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 42;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(512);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 43;BA.debugLine="lst_Sections.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _raisetouchstateevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseTouchStateEvent (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("raisetouchstateevent")) { return __ref.runUserSub(false, "asstepseekbar","raisetouchstateevent", __ref);}
 BA.debugLineNum = 188;BA.debugLine="Private Sub RaiseTouchStateEvent";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
Debug.ShouldStop(268435456);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchStateChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 190;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
Debug.ShouldStop(536870912);
asstepseekbar.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TouchStateChanged"))),(Object)((__ref.getField(true,"_pressed" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("setStepIndex (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("setstepindex")) { return __ref.runUserSub(false, "asstepseekbar","setstepindex", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 230;BA.debugLine="Public Sub setStepIndex(Index As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 232;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),asstepseekbar.__c.getField(true,"False"))) { 
 BA.debugLineNum = 233;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(Index) , 0)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_setvaluebasedontouch" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)))),(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 235;BA.debugLine="SetValueBasedOnTouch(0 ,lst_Y.Get(Index))";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_setvaluebasedontouch" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)))));
 };
 BA.debugLineNum = 237;BA.debugLine="Update";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("SetValueBasedOnTouch (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("setvaluebasedontouch")) { return __ref.runUserSub(false, "asstepseekbar","setvaluebasedontouch", __ref, _x, _y);}
RemoteObject _v = RemoteObject.createImmutable(0);
RemoteObject _newvalue = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _section = RemoteObject.declareNull("b4a.example.asstepseekbar._asstepseekbar_step");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 194;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Dim v As Int";
Debug.ShouldStop(4);
_v = RemoteObject.createImmutable(0);Debug.locals.put("v", _v);
 BA.debugLineNum = 196;BA.debugLine="If Vertical Then";
Debug.ShouldStop(8);
if (__ref.getField(true,"_vertical" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 197;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
Debug.ShouldStop(16);
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_radius2" /*RemoteObject*/ ),_y}, "--",2, 1)),__ref.getField(true,"_size" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "/*+",1, 0));Debug.locals.put("v", _v);
 }else {
 BA.debugLineNum = 199;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
Debug.ShouldStop(64);
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_size" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "/*+",1, 0));Debug.locals.put("v", _v);
 };
 BA.debugLineNum = 201;BA.debugLine="v = Round (v / Interval) * Interval";
Debug.ShouldStop(256);
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {asstepseekbar.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_v,__ref.getField(true,"_interval" /*RemoteObject*/ )}, "/",0, 0))),__ref.getField(true,"_interval" /*RemoteObject*/ )}, "*",0, 2));Debug.locals.put("v", _v);
 BA.debugLineNum = 202;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
Debug.ShouldStop(512);
_newvalue = BA.numberCast(int.class, asstepseekbar.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(true,"_minvalue" /*RemoteObject*/ ))),(Object)(asstepseekbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxvalue" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _v))))));Debug.locals.put("NewValue", _newvalue);Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 203;BA.debugLine="If NewValue <> mValue Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",_newvalue,BA.numberCast(double.class, __ref.getField(true,"_mvalue" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 204;BA.debugLine="mValue = NewValue";
Debug.ShouldStop(2048);
__ref.setField ("_mvalue" /*RemoteObject*/ ,_newvalue);
 BA.debugLineNum = 206;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),asstepseekbar.__c.getField(true,"False"))) { 
 BA.debugLineNum = 207;BA.debugLine="For i = 0 To lst_X.Size -1";
Debug.ShouldStop(16384);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 208;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 209;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 210;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
Debug.ShouldStop(131072);
_section = (__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("section", _section);Debug.locals.put("section", _section);
 BA.debugLineNum = 211;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
Debug.ShouldStop(262144);
asstepseekbar.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)(RemoteObject.createImmutable((_i))),(Object)(_section.getField(false,"Value" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 213;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 217;BA.debugLine="For i = 0 To lst_Y.Size -1";
Debug.ShouldStop(16777216);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 218;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 219;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
Debug.ShouldStop(67108864);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 220;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
Debug.ShouldStop(134217728);
_section = (__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("section", _section);Debug.locals.put("section", _section);
 BA.debugLineNum = 221;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
Debug.ShouldStop(268435456);
asstepseekbar.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ValueChanged"))),(Object)(RemoteObject.createImmutable((_i))),(Object)(_section.getField(false,"Value" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 223;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("TouchPanel_Touch (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("touchpanel_touch")) { return __ref.runUserSub(false, "asstepseekbar","touchpanel_touch", __ref, _action, _x, _y);}
int _i = 0;
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 143;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 145;BA.debugLine="Pressed = True";
Debug.ShouldStop(65536);
__ref.setField ("_pressed" /*RemoteObject*/ ,asstepseekbar.__c.getField(true,"True"));
 BA.debugLineNum = 146;BA.debugLine="RaiseTouchStateEvent";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_raisetouchstateevent" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 148;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_MOVE The";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE")))) { 
 BA.debugLineNum = 150;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),asstepseekbar.__c.getField(true,"False"))) { 
 BA.debugLineNum = 151;BA.debugLine="For i = 0 To lst_X.Size -1";
Debug.ShouldStop(4194304);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 152;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 153;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(i) , Y)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_setvaluebasedontouch" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)(BA.numberCast(int.class, _y)));
 BA.debugLineNum = 154;BA.debugLine="Exit";
Debug.ShouldStop(33554432);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 158;BA.debugLine="For i = 0 To lst_Y.Size -1";
Debug.ShouldStop(536870912);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 159;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 160;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(i))";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_setvaluebasedontouch" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 161;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 };
 }else 
{ BA.debugLineNum = 166;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_UP Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 167;BA.debugLine="Pressed = False";
Debug.ShouldStop(64);
__ref.setField ("_pressed" /*RemoteObject*/ ,asstepseekbar.__c.getField(true,"False"));
 BA.debugLineNum = 168;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),asstepseekbar.__c.getField(true,"False"))) { 
 BA.debugLineNum = 169;BA.debugLine="For i = 0 To lst_X.Size -1";
Debug.ShouldStop(256);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 170;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_x,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 171;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(i) , Y)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_setvaluebasedontouch" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_x" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)(BA.numberCast(int.class, _y)));
 BA.debugLineNum = 172;BA.debugLine="Exit";
Debug.ShouldStop(2048);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 176;BA.debugLine="For i = 0 To lst_Y.Size -1";
Debug.ShouldStop(32768);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30) ;_i = ((int)(0 + _i + step30))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 177;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 0))) && RemoteObject.solveBoolean("<",_y,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0)))) { 
 BA.debugLineNum = 178;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(i))";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_setvaluebasedontouch" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_lst_y" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 179;BA.debugLine="Exit";
Debug.ShouldStop(262144);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 183;BA.debugLine="RaiseTouchStateEvent";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_raisetouchstateevent" /*RemoteObject*/ );
 }}}
;
 BA.debugLineNum = 185;BA.debugLine="Update";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.asstepseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Update (asstepseekbar) ","asstepseekbar",2,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "asstepseekbar","update", __ref);}
RemoteObject _s1 = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _tmp_width = RemoteObject.createImmutable(0f);
RemoteObject _newx = RemoteObject.createImmutable(0f);
RemoteObject _section = RemoteObject.declareNull("b4a.example.asstepseekbar._asstepseekbar_step");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _tmp_height = RemoteObject.createImmutable(0f);
RemoteObject _newy = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 71;BA.debugLine="Public Sub Update";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.ShouldStop(256);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 74;BA.debugLine="If size > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_size" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="If Vertical = False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vertical" /*RemoteObject*/ ),asstepseekbar.__c.getField(true,"False"))) { 
 BA.debugLineNum = 76;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
Debug.ShouldStop(2048);
_s1 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_size" /*RemoteObject*/ )}, "+/*",1, 0));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 77;BA.debugLine="Dim y As Int = mBase.Height / 2";
Debug.ShouldStop(4096);
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 78;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, ReachedLineColo";
Debug.ShouldStop(8192);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(__ref.getField(true,"_reachedlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_reachedlinesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 79;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, U";
Debug.ShouldStop(16384);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 1))),(Object)(BA.numberCast(float.class, _y)),(Object)(__ref.getField(true,"_unreachedlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_unreachedlinesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 81;BA.debugLine="lst_X.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 83;BA.debugLine="For i = 0 To lst_Sections.Size -1";
Debug.ShouldStop(262144);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 85;BA.debugLine="Dim tmp_width As Float = (mBase.Width - Radius";
Debug.ShouldStop(1048576);
_tmp_width = BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_radius2" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1)));Debug.locals.put("tmp_width", _tmp_width);Debug.locals.put("tmp_width", _tmp_width);
 BA.debugLineNum = 87;BA.debugLine="Dim newx As Float = 0";
Debug.ShouldStop(4194304);
_newx = BA.numberCast(float.class, 0);Debug.locals.put("newx", _newx);Debug.locals.put("newx", _newx);
 BA.debugLineNum = 88;BA.debugLine="If i = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 89;BA.debugLine="newx = Radius2";
Debug.ShouldStop(16777216);
_newx = BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ));Debug.locals.put("newx", _newx);
 }else 
{ BA.debugLineNum = 90;BA.debugLine="Else if i = (lst_Sections.Size -1) Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 91;BA.debugLine="newx = tmp_width + Radius2";
Debug.ShouldStop(67108864);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tmp_width,__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("newx", _newx);
 }else {
 BA.debugLineNum = 93;BA.debugLine="newx = (tmp_width/(lst_Sections.Size -1)) * i";
Debug.ShouldStop(268435456);
_newx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_tmp_width,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "/",0, 0)),RemoteObject.createImmutable(_i),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "*+",1, 0));Debug.locals.put("newx", _newx);
 }}
;
 BA.debugLineNum = 95;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
Debug.ShouldStop(1073741824);
_section = (__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Section", _section);Debug.locals.put("Section", _section);
 BA.debugLineNum = 96;BA.debugLine="cvs.DrawCircle(newx,mBase.Height/2,Radius1,Sec";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(_newx),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius1" /*RemoteObject*/ ))),(Object)(_section.getField(true,"Color" /*RemoteObject*/ )),(Object)(asstepseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 97;BA.debugLine="lst_X.Add(newx)";
Debug.ShouldStop(1);
__ref.getField(false,"_lst_x" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_newx)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 101;BA.debugLine="cvs.DrawCircle(s1, y, Radius2/2, ReachedLineCol";
Debug.ShouldStop(16);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(true,"_reachedlinecolor" /*RemoteObject*/ )),(Object)(asstepseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 103;BA.debugLine="If Pressed Then";
Debug.ShouldStop(64);
if (__ref.getField(true,"_pressed" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 104;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
Debug.ShouldStop(128);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_thumbcolor" /*RemoteObject*/ )),(Object)(asstepseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 };
 }else {
 BA.debugLineNum = 107;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
Debug.ShouldStop(1024);
_s1 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_mvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "--",2, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvalue" /*RemoteObject*/ ),__ref.getField(true,"_minvalue" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_size" /*RemoteObject*/ )}, "+/*",1, 0));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 108;BA.debugLine="Dim x As Int = mBase.Width / 2";
Debug.ShouldStop(2048);
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 109;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, UnreachedLineCo";
Debug.ShouldStop(4096);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(__ref.getField(true,"_unreachedlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_unreachedlinesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 110;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
Debug.ShouldStop(8192);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "-",1, 1))),(Object)(__ref.getField(true,"_reachedlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, __ref.getField(true,"_reachedlinesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 112;BA.debugLine="lst_Y.Clear";
Debug.ShouldStop(32768);
__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 115;BA.debugLine="For i = 0 To lst_Sections.Size -1";
Debug.ShouldStop(262144);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33) ;_i = ((int)(0 + _i + step33))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 117;BA.debugLine="Dim tmp_height As Float = (mBase.Height - Radi";
Debug.ShouldStop(1048576);
_tmp_height = BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_radius2" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1)));Debug.locals.put("tmp_height", _tmp_height);Debug.locals.put("tmp_height", _tmp_height);
 BA.debugLineNum = 119;BA.debugLine="Dim newy As Float = 0";
Debug.ShouldStop(4194304);
_newy = BA.numberCast(float.class, 0);Debug.locals.put("newy", _newy);Debug.locals.put("newy", _newy);
 BA.debugLineNum = 120;BA.debugLine="If i = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 121;BA.debugLine="newy = Radius2";
Debug.ShouldStop(16777216);
_newy = BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ));Debug.locals.put("newy", _newy);
 }else 
{ BA.debugLineNum = 122;BA.debugLine="Else if i = (lst_Sections.Size -1) Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 123;BA.debugLine="newy = tmp_height + Radius2";
Debug.ShouldStop(67108864);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tmp_height,__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "+",1, 0));Debug.locals.put("newy", _newy);
 }else {
 BA.debugLineNum = 125;BA.debugLine="newy = (tmp_height/(lst_Sections.Size -1)) *";
Debug.ShouldStop(268435456);
_newy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_tmp_height,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "/",0, 0)),RemoteObject.createImmutable(_i),__ref.getField(true,"_radius2" /*RemoteObject*/ )}, "*+",1, 0));Debug.locals.put("newy", _newy);
 }}
;
 BA.debugLineNum = 127;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
Debug.ShouldStop(1073741824);
_section = (__ref.getField(false,"_lst_sections" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Section", _section);Debug.locals.put("Section", _section);
 BA.debugLineNum = 128;BA.debugLine="cvs.DrawCircle(mBase.Width/2,newy,Radius1,Sect";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_newy),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius1" /*RemoteObject*/ ))),(Object)(_section.getField(true,"Color" /*RemoteObject*/ )),(Object)(asstepseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 129;BA.debugLine="lst_Y.Add(newy)";
Debug.ShouldStop(1);
__ref.getField(false,"_lst_y" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_newy)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 133;BA.debugLine="cvs.DrawCircle(x, s1, Radius2/2, ReachedLineCol";
Debug.ShouldStop(16);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius2" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(true,"_reachedlinecolor" /*RemoteObject*/ )),(Object)(asstepseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 135;BA.debugLine="If Pressed Then";
Debug.ShouldStop(64);
if (__ref.getField(true,"_pressed" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 136;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
Debug.ShouldStop(128);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _s1)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_radius2" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_thumbcolor" /*RemoteObject*/ )),(Object)(asstepseekbar.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 };
 };
 };
 BA.debugLineNum = 140;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(2048);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}