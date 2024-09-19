package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asstepseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.asstepseekbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.asstepseekbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _asstepseekbar_step{
public boolean IsInitialized;
public Object Value;
public int Color;
public void Initialize() {
IsInitialized = true;
Value = new Object();
Color = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _reachedlinecolor = 0;
public int _unreachedlinecolor = 0;
public int _thumbcolor = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _mvalue = 0;
public int _minvalue = 0;
public int _maxvalue = 0;
public int _interval = 0;
public boolean _vertical = false;
public int _reachedlinesize = 0;
public int _unreachedlinesize = 0;
public int _radius1 = 0;
public int _radius2 = 0;
public boolean _pressed = false;
public int _size = 0;
public anywheresoftware.b4a.objects.collections.List _lst_sections = null;
public anywheresoftware.b4a.objects.collections.List _lst_x = null;
public anywheresoftware.b4a.objects.collections.List _lst_y = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _addstep(b4a.example.asstepseekbar __ref,int _color,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "addstep", false))
	 {return ((String) Debug.delegate(ba, "addstep", new Object[] {_color,_value}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub AddStep(Color As Int,Value As Object)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="lst_Sections.Add(CreateASStepSeekBar_Step(Value,C";
__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createasstepseekbar_step /*b4a.example.asstepseekbar._asstepseekbar_step*/ (null,_value,_color)));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="End Sub";
return "";
}
public b4a.example.asstepseekbar._asstepseekbar_step  _createasstepseekbar_step(b4a.example.asstepseekbar __ref,Object _value,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "createasstepseekbar_step", false))
	 {return ((b4a.example.asstepseekbar._asstepseekbar_step) Debug.delegate(ba, "createasstepseekbar_step", new Object[] {_value,_color}));}
b4a.example.asstepseekbar._asstepseekbar_step _t1 = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub CreateASStepSeekBar_Step (Value As Obje";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim t1 As ASStepSeekBar_Step";
_t1 = new b4a.example.asstepseekbar._asstepseekbar_step();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="t1.Value = Value";
_t1.Value /*Object*/  = _value;
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="End Sub";
return null;
}
public String  _update(b4a.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((String) Debug.delegate(ba, "update", null));}
int _s1 = 0;
int _y = 0;
int _i = 0;
float _tmp_width = 0f;
float _newx = 0f;
b4a.example.asstepseekbar._asstepseekbar_step _section = null;
int _x = 0;
float _tmp_height = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="If size > 0 Then";
if (__ref._size /*int*/ >0) { 
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, ReachedLineColo";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._radius2 /*int*/ ),(float) (_y),(float) (_s1),(float) (_y),__ref._reachedlinecolor /*int*/ ,(float) (__ref._reachedlinesize /*int*/ ));
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, U";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_s1),(float) (_y),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._radius2 /*int*/ ),(float) (_y),__ref._unreachedlinecolor /*int*/ ,(float) (__ref._unreachedlinesize /*int*/ ));
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="lst_X.Clear";
__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="For i = 0 To lst_Sections.Size -1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="Dim tmp_width As Float = (mBase.Width - Radius";
_tmp_width = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._radius2 /*int*/ *2));
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="Dim newx As Float = 0";
_newx = (float) (0);
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="If i = 0 Then";
if (_i==0) { 
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="newx = Radius2";
_newx = (float) (__ref._radius2 /*int*/ );
 }else 
{RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="Else if i = (lst_Sections.Size -1) Then";
if (_i==(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=1179668;
 //BA.debugLineNum = 1179668;BA.debugLine="newx = tmp_width + Radius2";
_newx = (float) (_tmp_width+__ref._radius2 /*int*/ );
 }else {
RDebugUtils.currentLine=1179670;
 //BA.debugLineNum = 1179670;BA.debugLine="newx = (tmp_width/(lst_Sections.Size -1)) * i";
_newx = (float) ((_tmp_width/(double)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))*_i+__ref._radius2 /*int*/ );
 }}
;
RDebugUtils.currentLine=1179672;
 //BA.debugLineNum = 1179672;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
_section = (b4a.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1179673;
 //BA.debugLineNum = 1179673;BA.debugLine="cvs.DrawCircle(newx,mBase.Height/2,Radius1,Sec";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(_newx,(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2),(float) (__ref._radius1 /*int*/ ),_section.Color /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=1179674;
 //BA.debugLineNum = 1179674;BA.debugLine="lst_X.Add(newx)";
__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newx));
 }
};
RDebugUtils.currentLine=1179678;
 //BA.debugLineNum = 1179678;BA.debugLine="cvs.DrawCircle(s1, y, Radius2/2, ReachedLineCol";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius2 /*int*/ /(double)2),__ref._reachedlinecolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=1179680;
 //BA.debugLineNum = 1179680;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=1179681;
 //BA.debugLineNum = 1179681;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 }else {
RDebugUtils.currentLine=1179684;
 //BA.debugLineNum = 1179684;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._maxvalue /*int*/ -__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=1179685;
 //BA.debugLineNum = 1179685;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=1179686;
 //BA.debugLineNum = 1179686;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, UnreachedLineCo";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (__ref._radius2 /*int*/ ),(float) (_x),(float) (_s1),__ref._unreachedlinecolor /*int*/ ,(float) (__ref._unreachedlinesize /*int*/ ));
RDebugUtils.currentLine=1179687;
 //BA.debugLineNum = 1179687;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (_s1),(float) (_x),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ ),__ref._reachedlinecolor /*int*/ ,(float) (__ref._reachedlinesize /*int*/ ));
RDebugUtils.currentLine=1179689;
 //BA.debugLineNum = 1179689;BA.debugLine="lst_Y.Clear";
__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1179692;
 //BA.debugLineNum = 1179692;BA.debugLine="For i = 0 To lst_Sections.Size -1";
{
final int step33 = 1;
final int limit33 = (int) (__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=1179694;
 //BA.debugLineNum = 1179694;BA.debugLine="Dim tmp_height As Float = (mBase.Height - Radi";
_tmp_height = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ *2));
RDebugUtils.currentLine=1179696;
 //BA.debugLineNum = 1179696;BA.debugLine="Dim newy As Float = 0";
_newy = (float) (0);
RDebugUtils.currentLine=1179697;
 //BA.debugLineNum = 1179697;BA.debugLine="If i = 0 Then";
if (_i==0) { 
RDebugUtils.currentLine=1179698;
 //BA.debugLineNum = 1179698;BA.debugLine="newy = Radius2";
_newy = (float) (__ref._radius2 /*int*/ );
 }else 
{RDebugUtils.currentLine=1179699;
 //BA.debugLineNum = 1179699;BA.debugLine="Else if i = (lst_Sections.Size -1) Then";
if (_i==(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=1179700;
 //BA.debugLineNum = 1179700;BA.debugLine="newy = tmp_height + Radius2";
_newy = (float) (_tmp_height+__ref._radius2 /*int*/ );
 }else {
RDebugUtils.currentLine=1179702;
 //BA.debugLineNum = 1179702;BA.debugLine="newy = (tmp_height/(lst_Sections.Size -1)) *";
_newy = (float) ((_tmp_height/(double)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))*_i+__ref._radius2 /*int*/ );
 }}
;
RDebugUtils.currentLine=1179704;
 //BA.debugLineNum = 1179704;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
_section = (b4a.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1179705;
 //BA.debugLineNum = 1179705;BA.debugLine="cvs.DrawCircle(mBase.Width/2,newy,Radius1,Sect";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),_newy,(float) (__ref._radius1 /*int*/ ),_section.Color /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=1179706;
 //BA.debugLineNum = 1179706;BA.debugLine="lst_Y.Add(newy)";
__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newy));
 }
};
RDebugUtils.currentLine=1179710;
 //BA.debugLineNum = 1179710;BA.debugLine="cvs.DrawCircle(x, s1, Radius2/2, ReachedLineCol";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius2 /*int*/ /(double)2),__ref._reachedlinecolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=1179712;
 //BA.debugLineNum = 1179712;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=1179713;
 //BA.debugLineNum = 1179713;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 };
 };
RDebugUtils.currentLine=1179717;
 //BA.debugLineNum = 1179717;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=1179718;
 //BA.debugLineNum = 1179718;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.asstepseekbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
__ref._size /*int*/  = (int) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-2*__ref._radius2 /*int*/ );
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Type ASStepSeekBar_Step(Value As Object,Color As";
;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Public ReachedLineColor, UnreachedLineColor, Thum";
_reachedlinecolor = 0;
_unreachedlinecolor = 0;
_thumbcolor = 0;
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Private mValue As Int = 0";
_mvalue = (int) (0);
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Private MinValue As Int = 0";
_minvalue = (int) (0);
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Private MaxValue As Int = 100";
_maxvalue = (int) (100);
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="Public Interval As Int = 1";
_interval = (int) (1);
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="Public ReachedLineSize = 4dip, UnreachedLineSize";
_reachedlinesize = __c.DipToCurrent((int) (4));
_unreachedlinesize = __c.DipToCurrent((int) (2));
_radius1 = __c.DipToCurrent((int) (6));
_radius2 = __c.DipToCurrent((int) (20));
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="Private Pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="Private size As Int";
_size = 0;
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="Private lst_Sections As List";
_lst_sections = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="Private lst_X,lst_Y As List";
_lst_x = new anywheresoftware.b4a.objects.collections.List();
_lst_y = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.asstepseekbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="ReachedLineColor = xui.PaintOrColorToColor(Props.";
__ref._reachedlinecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ReachedLineColor")));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="UnreachedLineColor = xui.PaintOrColorToColor(Prop";
__ref._unreachedlinecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("UnreachedLineColor")));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
__ref._thumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ThumbColor")));
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="End Sub";
return "";
}
public int  _getsize(b4a.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return lst_Sections.Size";
if (true) return __ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return 0;
}
public Object  _getstepvalue(b4a.example.asstepseekbar __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "getstepvalue", false))
	 {return ((Object) Debug.delegate(ba, "getstepvalue", new Object[] {_index}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub GetStepValue(Index As Int) As Object";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Return lst_Sections.Get(Index).As(ASStepSeekBar_S";
if (true) return ((b4a.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index))).Value /*Object*/ ;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.asstepseekbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="lst_Sections.Initialize";
__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return "";
}
public String  _raisetouchstateevent(b4a.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "raisetouchstateevent", false))
	 {return ((String) Debug.delegate(ba, "raisetouchstateevent", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub RaiseTouchStateEvent";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(int) (1))) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(Object)(__ref._pressed /*boolean*/ ));
 };
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="End Sub";
return "";
}
public String  _setstepindex(b4a.example.asstepseekbar __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "setstepindex", false))
	 {return ((String) Debug.delegate(ba, "setstepindex", new Object[] {_index}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub setStepIndex(Index As Int)";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(Index) , 0)";
__ref._setvaluebasedontouch /*String*/ (null,(int)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index))),(int) (0));
 }else {
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="SetValueBasedOnTouch(0 ,lst_Y.Get(Index))";
__ref._setvaluebasedontouch /*String*/ (null,(int) (0),(int)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index))));
 };
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="End Sub";
return "";
}
public String  _setvaluebasedontouch(b4a.example.asstepseekbar __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "setvaluebasedontouch", false))
	 {return ((String) Debug.delegate(ba, "setvaluebasedontouch", new Object[] {_x,_y}));}
int _v = 0;
int _newvalue = 0;
int _i = 0;
b4a.example.asstepseekbar._asstepseekbar_step _section = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim v As Int";
_v = 0;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ -_y)/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 }else {
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-__ref._radius2 /*int*/ )/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 };
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="v = Round (v / Interval) * Interval";
_v = (int) (__c.Round(_v/(double)__ref._interval /*int*/ )*__ref._interval /*int*/ );
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="For i = 0 To lst_X.Size -1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
if (_x>((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _x<((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (2))) { 
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
_section = (b4a.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
__c.CallSubDelayed3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(_i),_section.Value /*Object*/ );
 };
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
RDebugUtils.currentLine=1376279;
 //BA.debugLineNum = 1376279;BA.debugLine="For i = 0 To lst_Y.Size -1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=1376280;
 //BA.debugLineNum = 1376280;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
if (_y>((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _y<((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1376281;
 //BA.debugLineNum = 1376281;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (2))) { 
RDebugUtils.currentLine=1376282;
 //BA.debugLineNum = 1376282;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
_section = (b4a.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1376283;
 //BA.debugLineNum = 1376283;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
__c.CallSubDelayed3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(_i),_section.Value /*Object*/ );
 };
RDebugUtils.currentLine=1376285;
 //BA.debugLineNum = 1376285;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 };
RDebugUtils.currentLine=1376290;
 //BA.debugLineNum = 1376290;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(b4a.example.asstepseekbar __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "touchpanel_touch", false))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
int _i = 0;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Pressed = True";
__ref._pressed /*boolean*/  = __c.True;
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
 }else 
{RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_MOVE The";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="For i = 0 To lst_X.Size -1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
if (_x>((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _x<((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(i) , Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))),(int) (_y));
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="For i = 0 To lst_Y.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
if (_y>((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _y<((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(i))";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))));
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }else 
{RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="Pressed = False";
__ref._pressed /*boolean*/  = __c.False;
RDebugUtils.currentLine=1245209;
 //BA.debugLineNum = 1245209;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="For i = 0 To lst_X.Size -1";
{
final int step23 = 1;
final int limit23 = (int) (__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
if (_x>((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _x<((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1245212;
 //BA.debugLineNum = 1245212;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(i) , Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))),(int) (_y));
RDebugUtils.currentLine=1245213;
 //BA.debugLineNum = 1245213;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
RDebugUtils.currentLine=1245217;
 //BA.debugLineNum = 1245217;BA.debugLine="For i = 0 To lst_Y.Size -1";
{
final int step30 = 1;
final int limit30 = (int) (__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
RDebugUtils.currentLine=1245218;
 //BA.debugLineNum = 1245218;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
if (_y>((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _y<((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1245219;
 //BA.debugLineNum = 1245219;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(i))";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))));
RDebugUtils.currentLine=1245220;
 //BA.debugLineNum = 1245220;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=1245224;
 //BA.debugLineNum = 1245224;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
 }}}
;
RDebugUtils.currentLine=1245226;
 //BA.debugLineNum = 1245226;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=1245227;
 //BA.debugLineNum = 1245227;BA.debugLine="End Sub";
return "";
}
}