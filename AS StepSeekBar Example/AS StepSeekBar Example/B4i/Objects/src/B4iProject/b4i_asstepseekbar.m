
#import "b4i_asstepseekbar.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcache.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xcomparatorsort.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"

@implementation _asstepseekbar_step
-(void)Initialize{
self.IsInitialized = true;
self->_Value = [NSObject new];
self->_Color = 0;
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end

@implementation b4i_asstepseekbar 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_asstepseekbar) instance released.");
}

- (NSString*)  _addstep:(b4i_asstepseekbar*) __ref :(int) _color :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"addstep"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"addstep::" :@[@(_color),[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub AddStep(Color As Int,Value As Object)";
B4IRDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="lst_Sections.Add(CreateASStepSeekBar_Step(Value,C";
[__ref->__lst_sections /*B4IList**/  Add:(NSObject*)([__ref _createasstepseekbar_step /*_asstepseekbar_step**/ :nil :_value :_color])];
B4IRDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Update";
[__ref _update /*NSString**/ :nil];
B4IRDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="End Sub";
return @"";
}
- (_asstepseekbar_step*)  _createasstepseekbar_step:(b4i_asstepseekbar*) __ref :(NSObject*) _value :(int) _color{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"createasstepseekbar_step"])
	 {return ((_asstepseekbar_step*) [B4IDebug delegate:self.bi :@"createasstepseekbar_step::" :@[[B4I nilToNSNull:_value],@(_color)]]);}
_asstepseekbar_step* _t1 = nil;
B4IRDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub CreateASStepSeekBar_Step (Value As Obje";
B4IRDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim t1 As ASStepSeekBar_Step";
_t1 = [_asstepseekbar_step new];
B4IRDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="t1.Initialize";
[_t1 Initialize];
B4IRDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="t1.Value = Value";
_t1->_Value /*NSObject**/  = _value;
B4IRDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="t1.Color = Color";
_t1->_Color /*int*/  = _color;
B4IRDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Return t1";
if (true) return _t1;
B4IRDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _update:(b4i_asstepseekbar*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"update"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"update" :nil]);}
int _s1 = 0;
int _y = 0;
int _i = 0;
float _tmp_width = 0.0f;
float _newx = 0.0f;
_asstepseekbar_step* _section = nil;
int _x = 0;
float _tmp_height = 0.0f;
float _newy = 0.0f;
B4IRDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Update";
B4IRDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
[__ref->__cvs /*B4XCanvas**/  ClearRect:[__ref->__cvs /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="If size > 0 Then";
if (__ref->__size /*int*/ >0) { 
B4IRDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="If Vertical = False Then";
if (__ref->__vertical /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (__ref->__radius2 /*int*/ +(__ref->__mvalue /*int*/ -__ref->__minvalue /*int*/ )/(double)(__ref->__maxvalue /*int*/ -__ref->__minvalue /*int*/ )*__ref->__size /*int*/ );
B4IRDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) ([__ref->__mbase /*B4XViewWrapper**/  Height]/(double)2);
B4IRDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, ReachedLineColo";
[__ref->__cvs /*B4XCanvas**/  DrawLine:(float) (__ref->__radius2 /*int*/ ) :(float) (_y) :(float) (_s1) :(float) (_y) :__ref->__reachedlinecolor /*int*/  :(float) (__ref->__reachedlinesize /*int*/ )];
B4IRDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, U";
[__ref->__cvs /*B4XCanvas**/  DrawLine:(float) (_s1) :(float) (_y) :(float) ([__ref->__mbase /*B4XViewWrapper**/  Width]-__ref->__radius2 /*int*/ ) :(float) (_y) :__ref->__unreachedlinecolor /*int*/  :(float) (__ref->__unreachedlinesize /*int*/ )];
B4IRDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="lst_X.Clear";
[__ref->__lst_x /*B4IList**/  Clear];
B4IRDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="For i = 0 To lst_Sections.Size -1";
{
const int step9 = 1;
const int limit9 = (int) ([__ref->__lst_sections /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
B4IRDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Dim tmp_width As Float = (mBase.Width - Radius";
_tmp_width = (float) (([__ref->__mbase /*B4XViewWrapper**/  Width]-__ref->__radius2 /*int*/ *2));
B4IRDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Dim newx As Float = 0";
_newx = (float) (0);
B4IRDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="If i = 0 Then";
if (_i==0) { 
B4IRDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="newx = Radius2";
_newx = (float) (__ref->__radius2 /*int*/ );
 }else if(_i==([__ref->__lst_sections /*B4IList**/  Size]-1)) { 
B4IRDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="newx = tmp_width + Radius2";
_newx = (float) (_tmp_width+__ref->__radius2 /*int*/ );
 }else {
B4IRDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="newx = (tmp_width/(lst_Sections.Size -1)) * i";
_newx = (float) ((_tmp_width/(double)([__ref->__lst_sections /*B4IList**/  Size]-1))*_i+__ref->__radius2 /*int*/ );
 };
B4IRDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
_section = (_asstepseekbar_step*)([__ref->__lst_sections /*B4IList**/  Get:_i]);
B4IRDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="cvs.DrawCircle(newx,mBase.Height/2,Radius1,Sec";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:_newx :(float) ([__ref->__mbase /*B4XViewWrapper**/  Height]/(double)2) :(float) (__ref->__radius1 /*int*/ ) :_section->_Color /*int*/  :true :(float) (0)];
B4IRDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="lst_X.Add(newx)";
[__ref->__lst_x /*B4IList**/  Add:(NSObject*)(@(_newx))];
 }
};
B4IRDebugUtils.currentLine=851998;
 //BA.debugLineNum = 851998;BA.debugLine="cvs.DrawCircle(s1, y, Radius2/2, ReachedLineCol";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:(float) (_s1) :(float) (_y) :(float) (__ref->__radius2 /*int*/ /(double)2) :__ref->__reachedlinecolor /*int*/  :true :(float) (0)];
B4IRDebugUtils.currentLine=852000;
 //BA.debugLineNum = 852000;BA.debugLine="If Pressed Then";
if (__ref->__pressed /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=852001;
 //BA.debugLineNum = 852001;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:(float) (_s1) :(float) (_y) :(float) (__ref->__radius2 /*int*/ ) :__ref->__thumbcolor /*int*/  :true :(float) (0)];
 };
 }else {
B4IRDebugUtils.currentLine=852004;
 //BA.debugLineNum = 852004;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
_s1 = (int) (__ref->__radius2 /*int*/ +(__ref->__maxvalue /*int*/ -__ref->__mvalue /*int*/ -__ref->__minvalue /*int*/ )/(double)(__ref->__maxvalue /*int*/ -__ref->__minvalue /*int*/ )*__ref->__size /*int*/ );
B4IRDebugUtils.currentLine=852005;
 //BA.debugLineNum = 852005;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) ([__ref->__mbase /*B4XViewWrapper**/  Width]/(double)2);
B4IRDebugUtils.currentLine=852006;
 //BA.debugLineNum = 852006;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, UnreachedLineCo";
[__ref->__cvs /*B4XCanvas**/  DrawLine:(float) (_x) :(float) (__ref->__radius2 /*int*/ ) :(float) (_x) :(float) (_s1) :__ref->__unreachedlinecolor /*int*/  :(float) (__ref->__unreachedlinesize /*int*/ )];
B4IRDebugUtils.currentLine=852007;
 //BA.debugLineNum = 852007;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
[__ref->__cvs /*B4XCanvas**/  DrawLine:(float) (_x) :(float) (_s1) :(float) (_x) :(float) ([__ref->__mbase /*B4XViewWrapper**/  Height]-__ref->__radius2 /*int*/ ) :__ref->__reachedlinecolor /*int*/  :(float) (__ref->__reachedlinesize /*int*/ )];
B4IRDebugUtils.currentLine=852009;
 //BA.debugLineNum = 852009;BA.debugLine="lst_Y.Clear";
[__ref->__lst_y /*B4IList**/  Clear];
B4IRDebugUtils.currentLine=852012;
 //BA.debugLineNum = 852012;BA.debugLine="For i = 0 To lst_Sections.Size -1";
{
const int step33 = 1;
const int limit33 = (int) ([__ref->__lst_sections /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
B4IRDebugUtils.currentLine=852014;
 //BA.debugLineNum = 852014;BA.debugLine="Dim tmp_height As Float = (mBase.Height - Radi";
_tmp_height = (float) (([__ref->__mbase /*B4XViewWrapper**/  Height]-__ref->__radius2 /*int*/ *2));
B4IRDebugUtils.currentLine=852016;
 //BA.debugLineNum = 852016;BA.debugLine="Dim newy As Float = 0";
_newy = (float) (0);
B4IRDebugUtils.currentLine=852017;
 //BA.debugLineNum = 852017;BA.debugLine="If i = 0 Then";
if (_i==0) { 
B4IRDebugUtils.currentLine=852018;
 //BA.debugLineNum = 852018;BA.debugLine="newy = Radius2";
_newy = (float) (__ref->__radius2 /*int*/ );
 }else if(_i==([__ref->__lst_sections /*B4IList**/  Size]-1)) { 
B4IRDebugUtils.currentLine=852020;
 //BA.debugLineNum = 852020;BA.debugLine="newy = tmp_height + Radius2";
_newy = (float) (_tmp_height+__ref->__radius2 /*int*/ );
 }else {
B4IRDebugUtils.currentLine=852022;
 //BA.debugLineNum = 852022;BA.debugLine="newy = (tmp_height/(lst_Sections.Size -1)) *";
_newy = (float) ((_tmp_height/(double)([__ref->__lst_sections /*B4IList**/  Size]-1))*_i+__ref->__radius2 /*int*/ );
 };
B4IRDebugUtils.currentLine=852024;
 //BA.debugLineNum = 852024;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
_section = (_asstepseekbar_step*)([__ref->__lst_sections /*B4IList**/  Get:_i]);
B4IRDebugUtils.currentLine=852025;
 //BA.debugLineNum = 852025;BA.debugLine="cvs.DrawCircle(mBase.Width/2,newy,Radius1,Sect";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:(float) ([__ref->__mbase /*B4XViewWrapper**/  Width]/(double)2) :_newy :(float) (__ref->__radius1 /*int*/ ) :_section->_Color /*int*/  :true :(float) (0)];
B4IRDebugUtils.currentLine=852026;
 //BA.debugLineNum = 852026;BA.debugLine="lst_Y.Add(newy)";
[__ref->__lst_y /*B4IList**/  Add:(NSObject*)(@(_newy))];
 }
};
B4IRDebugUtils.currentLine=852030;
 //BA.debugLineNum = 852030;BA.debugLine="cvs.DrawCircle(x, s1, Radius2/2, ReachedLineCol";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:(float) (_x) :(float) (_s1) :(float) (__ref->__radius2 /*int*/ /(double)2) :__ref->__reachedlinecolor /*int*/  :true :(float) (0)];
B4IRDebugUtils.currentLine=852032;
 //BA.debugLineNum = 852032;BA.debugLine="If Pressed Then";
if (__ref->__pressed /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=852033;
 //BA.debugLineNum = 852033;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:(float) (_x) :(float) (_s1) :(float) (__ref->__radius2 /*int*/ ) :__ref->__thumbcolor /*int*/  :true :(float) (0)];
 };
 };
 };
B4IRDebugUtils.currentLine=852037;
 //BA.debugLineNum = 852037;BA.debugLine="cvs.Invalidate";
[__ref->__cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=852038;
 //BA.debugLineNum = 852038;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _base_resize:(b4i_asstepseekbar*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
B4IRDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="cvs.Resize(Width, Height)";
[__ref->__cvs /*B4XCanvas**/  Resize:(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
[__ref->__touchpanel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref->__vertical /*BOOL*/  = [__ref->__mbase /*B4XViewWrapper**/  Height]>[__ref->__mbase /*B4XViewWrapper**/  Width];
B4IRDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
__ref->__size /*int*/  = (int) (fmax([__ref->__mbase /*B4XViewWrapper**/  Height],[__ref->__mbase /*B4XViewWrapper**/  Width])-2*__ref->__radius2 /*int*/ );
B4IRDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Update";
[__ref _update /*NSString**/ :nil];
B4IRDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_asstepseekbar*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"asstepseekbar";
B4IRDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Type ASStepSeekBar_Step(Value As Object,Color As";
;
B4IRDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Public ReachedLineColor, UnreachedLineColor, Thum";
self->__reachedlinecolor = 0;
self->__unreachedlinecolor = 0;
self->__thumbcolor = 0;
B4IRDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Private cvs As B4XCanvas";
self->__cvs = [B4XCanvas new];
B4IRDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Private TouchPanel As B4XView";
self->__touchpanel = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Private mValue As Int = 0";
self->__mvalue = (int) (0);
B4IRDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Private MinValue As Int = 0";
self->__minvalue = (int) (0);
B4IRDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Private MaxValue As Int = 100";
self->__maxvalue = (int) (100);
B4IRDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Public Interval As Int = 1";
self->__interval = (int) (1);
B4IRDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Private Vertical As Boolean";
self->__vertical = false;
B4IRDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Public ReachedLineSize = 4dip, UnreachedLineSize";
self->__reachedlinesize = ((int) (4));
self->__unreachedlinesize = ((int) (2));
self->__radius1 = ((int) (6));
self->__radius2 = ((int) (20));
B4IRDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="Private Pressed As Boolean";
self->__pressed = false;
B4IRDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Private size As Int";
self->__size = 0;
B4IRDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="Private lst_Sections As List";
self->__lst_sections = [B4IList new];
B4IRDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="Private lst_X,lst_Y As List";
self->__lst_x = [B4IList new];
self->__lst_y = [B4IList new];
B4IRDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="Private m_Index As Int = 0";
self->__m_index = (int) (0);
B4IRDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear:(b4i_asstepseekbar*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"clear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clear" :nil]);}
B4IRDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Clear";
B4IRDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="lst_Sections.Clear";
[__ref->__lst_sections /*B4IList**/  Clear];
B4IRDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_asstepseekbar*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4IRDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/  = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(_base)];
B4IRDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="ReachedLineColor = xui.PaintOrColorToColor(Props.";
__ref->__reachedlinecolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"ReachedLineColor")]];
B4IRDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="UnreachedLineColor = xui.PaintOrColorToColor(Prop";
__ref->__unreachedlinecolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"UnreachedLineColor")]];
B4IRDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
__ref->__thumbcolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"ThumbColor")]];
B4IRDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="cvs.Initialize(mBase)";
[__ref->__cvs /*B4XCanvas**/  Initialize:(UIView*)((__ref->__mbase /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref->__touchpanel /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"TouchPanel"];
B4IRDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__touchpanel /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="End Sub";
return @"";
}
- (int)  _getsize:(b4i_asstepseekbar*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"getsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getsize" :nil]).intValue;}
B4IRDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub getSize As Int";
B4IRDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Return lst_Sections.Size";
if (true) return [__ref->__lst_sections /*B4IList**/  Size];
B4IRDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return 0;
}
- (int)  _getstepindex:(b4i_asstepseekbar*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"getstepindex"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getstepindex" :nil]).intValue;}
B4IRDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub getStepIndex As Int";
B4IRDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Return m_Index";
if (true) return __ref->__m_index /*int*/ ;
B4IRDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return 0;
}
- (NSObject*)  _getstepvalue:(b4i_asstepseekbar*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"getstepvalue"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getstepvalue:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub GetStepValue(Index As Int) As Object";
B4IRDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Return lst_Sections.Get(Index).As(ASStepSeekBar_S";
if (true) return ((_asstepseekbar_step*)([__ref->__lst_sections /*B4IList**/  Get:_index]))->_Value /*NSObject**/ ;
B4IRDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(b4i_asstepseekbar*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="lst_Sections.Initialize";
[__ref->__lst_sections /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
[__ref->__lst_x /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
[__ref->__lst_y /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _raisetouchstateevent:(b4i_asstepseekbar*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"raisetouchstateevent"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"raisetouchstateevent" :nil]);}
B4IRDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub RaiseTouchStateEvent";
B4IRDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_TouchStateChanged"] componentsJoinedByString:@""] :(int) (1)]) { 
B4IRDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
[self->___c CallSubDelayed2:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_TouchStateChanged"] componentsJoinedByString:@""] :(NSObject*)(@(__ref->__pressed /*BOOL*/ ))];
 };
B4IRDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setstepindex:(b4i_asstepseekbar*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"setstepindex"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setstepindex:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub setStepIndex(Index As Int)";
B4IRDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If Vertical = False Then";
if (__ref->__vertical /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(Index) , 0)";
[__ref _setvaluebasedontouch /*NSString**/ :nil :[self.bi ObjectToNumber:[__ref->__lst_x /*B4IList**/  Get:_index]].intValue :(int) (0)];
 }else {
B4IRDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="SetValueBasedOnTouch(0 ,lst_Y.Get(Index))";
[__ref _setvaluebasedontouch /*NSString**/ :nil :(int) (0) :[self.bi ObjectToNumber:[__ref->__lst_y /*B4IList**/  Get:_index]].intValue];
 };
B4IRDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Update";
[__ref _update /*NSString**/ :nil];
B4IRDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setvaluebasedontouch:(b4i_asstepseekbar*) __ref :(int) _x :(int) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"setvaluebasedontouch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setvaluebasedontouch::" :@[@(_x),@(_y)]]);}
int _v = 0;
int _newvalue = 0;
int _i = 0;
_asstepseekbar_step* _section = nil;
B4IRDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
B4IRDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim v As Int";
_v = 0;
B4IRDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If Vertical Then";
if (__ref->__vertical /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) (([__ref->__mbase /*B4XViewWrapper**/  Height]-__ref->__radius2 /*int*/ -_y)/(double)__ref->__size /*int*/ *(__ref->__maxvalue /*int*/ -__ref->__minvalue /*int*/ )+__ref->__minvalue /*int*/ );
 }else {
B4IRDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-__ref->__radius2 /*int*/ )/(double)__ref->__size /*int*/ *(__ref->__maxvalue /*int*/ -__ref->__minvalue /*int*/ )+__ref->__minvalue /*int*/ );
 };
B4IRDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="v = Round (v / Interval) * Interval";
_v = (int) (((double)lrint(_v/(double)__ref->__interval /*int*/ ))*__ref->__interval /*int*/ );
B4IRDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (fmax(__ref->__minvalue /*int*/ ,fmin(__ref->__maxvalue /*int*/ ,_v)));
B4IRDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref->__mvalue /*int*/ ) { 
B4IRDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="mValue = NewValue";
__ref->__mvalue /*int*/  = _newvalue;
B4IRDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="If Vertical = False Then";
if (__ref->__vertical /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="For i = 0 To lst_X.Size -1";
{
const int step12 = 1;
const int limit12 = (int) ([__ref->__lst_x /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
B4IRDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
if (_x>([self.bi ObjectToNumber:[__ref->__lst_x /*B4IList**/  Get:_i]].doubleValue-__ref->__radius2 /*int*/ ) && _x<([self.bi ObjectToNumber:[__ref->__lst_x /*B4IList**/  Get:_i]].doubleValue+__ref->__radius2 /*int*/ )) { 
B4IRDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="m_Index = i";
__ref->__m_index /*int*/  = _i;
B4IRDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_ValueChanged"] componentsJoinedByString:@""] :(int) (2)]) { 
B4IRDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
_section = (_asstepseekbar_step*)([__ref->__lst_sections /*B4IList**/  Get:_i]);
B4IRDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
[self->___c CallSubDelayed3:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_ValueChanged"] componentsJoinedByString:@""] :(NSObject*)(@(_i)) :_section->_Value /*NSObject**/ ];
 };
B4IRDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
B4IRDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="For i = 0 To lst_Y.Size -1";
{
const int step23 = 1;
const int limit23 = (int) ([__ref->__lst_y /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
B4IRDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
if (_y>([self.bi ObjectToNumber:[__ref->__lst_y /*B4IList**/  Get:_i]].doubleValue-__ref->__radius2 /*int*/ ) && _y<([self.bi ObjectToNumber:[__ref->__lst_y /*B4IList**/  Get:_i]].doubleValue+__ref->__radius2 /*int*/ )) { 
B4IRDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="m_Index = i";
__ref->__m_index /*int*/  = _i;
B4IRDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_ValueChanged"] componentsJoinedByString:@""] :(int) (2)]) { 
B4IRDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
_section = (_asstepseekbar_step*)([__ref->__lst_sections /*B4IList**/  Get:_i]);
B4IRDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
[self->___c CallSubDelayed3:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_ValueChanged"] componentsJoinedByString:@""] :(NSObject*)(@(_i)) :_section->_Value /*NSObject**/ ];
 };
B4IRDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 };
B4IRDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _touchpanel_touch:(b4i_asstepseekbar*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"asstepseekbar";
if ([B4IDebug shouldDelegate: @"touchpanel_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"touchpanel_touch:::" :@[@(_action),@(_x),@(_y)]]);}
int _i = 0;
int _thisindex = 0;
float _itemwidth = 0.0f;
float _itemheight = 0.0f;
B4IRDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
B4IRDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==[__ref->__touchpanel /*B4XViewWrapper**/  TOUCH_ACTION_DOWN]) { 
B4IRDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Pressed = True";
__ref->__pressed /*BOOL*/  = true;
B4IRDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="RaiseTouchStateEvent";
[__ref _raisetouchstateevent /*NSString**/ :nil];
 }else if(_action==[__ref->__touchpanel /*B4XViewWrapper**/  TOUCH_ACTION_MOVE]) { 
B4IRDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="If Vertical = False Then";
if (__ref->__vertical /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="For i = 0 To lst_X.Size -1";
{
const int step6 = 1;
const int limit6 = (int) ([__ref->__lst_x /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
B4IRDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
if (_x>([self.bi ObjectToNumber:[__ref->__lst_x /*B4IList**/  Get:_i]].doubleValue-__ref->__radius2 /*int*/ ) && _x<([self.bi ObjectToNumber:[__ref->__lst_x /*B4IList**/  Get:_i]].doubleValue+__ref->__radius2 /*int*/ )) { 
B4IRDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(i) , Y)";
[__ref _setvaluebasedontouch /*NSString**/ :nil :[self.bi ObjectToNumber:[__ref->__lst_x /*B4IList**/  Get:_i]].intValue :(int) (_y)];
B4IRDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
B4IRDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="For i = 0 To lst_Y.Size -1";
{
const int step13 = 1;
const int limit13 = (int) ([__ref->__lst_y /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
B4IRDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
if (_y>([self.bi ObjectToNumber:[__ref->__lst_y /*B4IList**/  Get:_i]].doubleValue-__ref->__radius2 /*int*/ ) && _y<([self.bi ObjectToNumber:[__ref->__lst_y /*B4IList**/  Get:_i]].doubleValue+__ref->__radius2 /*int*/ )) { 
B4IRDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(i))";
[__ref _setvaluebasedontouch /*NSString**/ :nil :(int) (_x) :[self.bi ObjectToNumber:[__ref->__lst_y /*B4IList**/  Get:_i]].intValue];
B4IRDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }else if(_action==[__ref->__touchpanel /*B4XViewWrapper**/  TOUCH_ACTION_UP]) { 
B4IRDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="Pressed = False";
__ref->__pressed /*BOOL*/  = false;
B4IRDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="If Vertical = False Then";
if (__ref->__vertical /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=917530;
 //BA.debugLineNum = 917530;BA.debugLine="Dim ThisIndex As Int = 0";
_thisindex = (int) (0);
B4IRDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="Dim ItemWidth As Float = (mBase.Width/lst_X.Siz";
_itemwidth = (float) (([__ref->__mbase /*B4XViewWrapper**/  Width]/(double)[__ref->__lst_x /*B4IList**/  Size])+__ref->__radius2 /*int*/ );
B4IRDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="For i = 0 To lst_X.Size -1";
{
const int step25 = 1;
const int limit25 = (int) ([__ref->__lst_x /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
B4IRDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="If Round(x) >= Round((lst_X.Get(i) - (ItemWidt";
if (((double)lrint(_x))>=((double)lrint(([self.bi ObjectToNumber:[__ref->__lst_x /*B4IList**/  Get:_i]].doubleValue-(_itemwidth/(double)2)))) && ((double)lrint(_x))<=((double)lrint(([self.bi ObjectToNumber:[__ref->__lst_x /*B4IList**/  Get:_i]].doubleValue+(_itemwidth/(double)2))))) { 
B4IRDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="ThisIndex = i";
_thisindex = _i;
B4IRDebugUtils.currentLine=917535;
 //BA.debugLineNum = 917535;BA.debugLine="Exit";
if (true) break;
 };
 }
};
B4IRDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(ThisIndex) , Y)";
[__ref _setvaluebasedontouch /*NSString**/ :nil :[self.bi ObjectToNumber:[__ref->__lst_x /*B4IList**/  Get:_thisindex]].intValue :(int) (_y)];
 }else {
B4IRDebugUtils.currentLine=917544;
 //BA.debugLineNum = 917544;BA.debugLine="Dim ThisIndex As Int = 0";
_thisindex = (int) (0);
B4IRDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="Dim ItemHeight As Float = mBase.Height/lst_Y.Si";
_itemheight = (float) ([__ref->__mbase /*B4XViewWrapper**/  Height]/(double)[__ref->__lst_y /*B4IList**/  Size]);
B4IRDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="For i = 0 To lst_Y.Size -1";
{
const int step35 = 1;
const int limit35 = (int) ([__ref->__lst_y /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit35 ;_i = _i + step35 ) {
B4IRDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="If Round(y) >= Round((lst_y.Get(i) - (Itemheig";
if (((double)lrint(_y))>=((double)lrint(([self.bi ObjectToNumber:[__ref->__lst_y /*B4IList**/  Get:_i]].doubleValue-(_itemheight/(double)2)))) && ((double)lrint(_y))<=((double)lrint(([self.bi ObjectToNumber:[__ref->__lst_y /*B4IList**/  Get:_i]].doubleValue+(_itemheight/(double)2))))) { 
B4IRDebugUtils.currentLine=917548;
 //BA.debugLineNum = 917548;BA.debugLine="ThisIndex = i";
_thisindex = _i;
B4IRDebugUtils.currentLine=917549;
 //BA.debugLineNum = 917549;BA.debugLine="Exit";
if (true) break;
 };
 }
};
B4IRDebugUtils.currentLine=917556;
 //BA.debugLineNum = 917556;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(ThisIndex))";
[__ref _setvaluebasedontouch /*NSString**/ :nil :(int) (_x) :[self.bi ObjectToNumber:[__ref->__lst_y /*B4IList**/  Get:_thisindex]].intValue];
 };
B4IRDebugUtils.currentLine=917558;
 //BA.debugLineNum = 917558;BA.debugLine="RaiseTouchStateEvent";
[__ref _raisetouchstateevent /*NSString**/ :nil];
 };
B4IRDebugUtils.currentLine=917560;
 //BA.debugLineNum = 917560;BA.debugLine="Update";
[__ref _update /*NSString**/ :nil];
B4IRDebugUtils.currentLine=917561;
 //BA.debugLineNum = 917561;BA.debugLine="End Sub";
return @"";
}
@end