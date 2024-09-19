
#import "b4i_b4xbytesbuilder.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_asstepseekbar.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xcache.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xcomparatorsort.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xbytesbuilder 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xbytesbuilder) instance released.");
}

- (b4i_b4xbytesbuilder*)  _append:(b4i_b4xbytesbuilder*) __ref :(B4IArray*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"append"])
	 {return ((b4i_b4xbytesbuilder*) [B4IDebug delegate:self.bi :@"append:" :@[[B4I nilToNSNull:_data]]]);}
B4IRDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Append(Data() As Byte) As B4XBytesBuild";
B4IRDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Return Append2(Data, 0, Data.Length)";
if (true) return [__ref _append2 /*b4i_b4xbytesbuilder**/ :nil :_data :(int) (0) :_data.Length];
B4IRDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xbytesbuilder*)  _append2:(b4i_b4xbytesbuilder*) __ref :(B4IArray*) _data :(int) _startindex :(int) _length{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"append2"])
	 {return ((b4i_b4xbytesbuilder*) [B4IDebug delegate:self.bi :@"append2:::" :@[[B4I nilToNSNull:_data],@(_startindex),@(_length)]]);}
int _oldlength = 0;
B4IRDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub Append2(Data() As Byte, StartIndex As I";
B4IRDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Len";
_oldlength = [__ref _changelength /*int*/ :nil :(int) (__ref->__mlength /*int*/ +_length)];
B4IRDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Bit.ArrayCopy(Data, StartIndex, mBuffer, OldLengt";
B4I_MEMCPY((_data)->internalBuffer + (_startindex), (__ref->__mbuffer /*B4IArray**/ )->internalBuffer + (_oldlength),_length);
B4IRDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Return Me";
if (true) return (b4i_b4xbytesbuilder*)(self);
B4IRDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="End Sub";
return nil;
}
- (int)  _changelength:(b4i_b4xbytesbuilder*) __ref :(int) _newlength{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"changelength"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"changelength:" :@[@(_newlength)]]).intValue;}
int _oldlength = 0;
B4IArray* _b = nil;
B4IRDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub ChangeLength (NewLength As Int) As Int";
B4IRDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim OldLength As Int = mLength";
_oldlength = __ref->__mlength /*int*/ ;
B4IRDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="mLength = NewLength";
__ref->__mlength /*int*/  = _newlength;
B4IRDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="If mBuffer.Length < mLength Then";
if (__ref->__mbuffer /*B4IArray**/ .Length<__ref->__mlength /*int*/ ) { 
B4IRDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Dim b(Max(mBuffer.Length * 2, NewLength)) As Byt";
_b = [[B4IArray alloc]initBytes:@[@((int) (fmax(__ref->__mbuffer /*B4IArray**/ .Length*2,_newlength)))]];
B4IRDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Bit.ArrayCopy(mBuffer, 0, b, 0, mBuffer.Length)";
B4I_MEMCPY((__ref->__mbuffer /*B4IArray**/ )->internalBuffer + ((int) (0)), (_b)->internalBuffer + ((int) (0)),__ref->__mbuffer /*B4IArray**/ .Length);
B4IRDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="mBuffer = b";
__ref->__mbuffer /*B4IArray**/  = _b;
 };
B4IRDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Return OldLength";
if (true) return _oldlength;
B4IRDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _class_globals:(b4i_b4xbytesbuilder*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
B4IRDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Private mBuffer() As Byte";
self->__mbuffer = [[B4IArray alloc]initBytes:@[@((int) (0))]];
B4IRDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Private mLength As Int";
self->__mlength = 0;
B4IRDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear:(b4i_b4xbytesbuilder*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"clear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clear" :nil]);}
B4IRDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub Clear";
B4IRDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="ChangeLength(0)";
[__ref _changelength /*int*/ :nil :(int) (0)];
B4IRDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return @"";
}
- (B4IArray*)  _getbuffer:(b4i_b4xbytesbuilder*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"getbuffer"])
	 {return ((B4IArray*) [B4IDebug delegate:self.bi :@"getbuffer" :nil]);}
B4IRDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub getBuffer As Byte() 'ignore";
B4IRDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="End Sub";
return nil;
}
- (B4IArray*)  _getinternalbuffer:(b4i_b4xbytesbuilder*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"getinternalbuffer"])
	 {return ((B4IArray*) [B4IDebug delegate:self.bi :@"getinternalbuffer" :nil]);}
B4IRDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub getInternalBuffer As Byte()";
B4IRDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Return mBuffer";
if (true) return __ref->__mbuffer /*B4IArray**/ ;
B4IRDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return nil;
}
- (int)  _getlength:(b4i_b4xbytesbuilder*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"getlength"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getlength" :nil]).intValue;}
B4IRDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub getLength As Int";
B4IRDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Return mLength";
if (true) return __ref->__mlength /*int*/ ;
B4IRDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return 0;
}
- (int)  _indexof:(b4i_b4xbytesbuilder*) __ref :(B4IArray*) _searchfor{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"indexof"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"indexof:" :@[[B4I nilToNSNull:_searchfor]]]).intValue;}
B4IRDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub IndexOf(SearchFor() As Byte) As Int";
B4IRDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Return IndexOf2(SearchFor, 0)";
if (true) return [__ref _indexof2 /*int*/ :nil :_searchfor :(int) (0)];
B4IRDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return 0;
}
- (int)  _indexof2:(b4i_b4xbytesbuilder*) __ref :(B4IArray*) _searchfor :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"indexof2"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"indexof2::" :@[[B4I nilToNSNull:_searchfor],@(_index)]]).intValue;}
int _i1 = 0;
int _i2 = 0;
B4IRDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub IndexOf2(SearchFor() As Byte, Index As";
B4IRDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="For i1 = Index To mLength - SearchFor.Length";
{
const int step1 = 1;
const int limit1 = (int) (__ref->__mlength /*int*/ -_searchfor.Length);
_i1 = _index ;
for (;_i1 <= limit1 ;_i1 = _i1 + step1 ) {
B4IRDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="For i2 = 0 To SearchFor.Length - 1";
{
const int step2 = 1;
const int limit2 = (int) (_searchfor.Length-1);
_i2 = (int) (0) ;
for (;_i2 <= limit2 ;_i2 = _i2 + step2 ) {
B4IRDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="If SearchFor(i2) <> mBuffer(i1 + i2) Then";
if ([_searchfor getByteFast:_i2]!=[__ref->__mbuffer /*B4IArray**/  getByteFast:(int) (_i1+_i2)]) { 
B4IRDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Exit";
if (true) break;
 };
 }
};
B4IRDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="If i2 = SearchFor.Length Then";
if (_i2==_searchfor.Length) { 
B4IRDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="Return i1";
if (true) return _i1;
 };
 }
};
B4IRDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="Return -1";
if (true) return (int) (-1);
B4IRDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(b4i_b4xbytesbuilder*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim mBuffer(100) As Byte";
self->__mbuffer = [[B4IArray alloc]initBytes:@[@((int) (100))]];
B4IRDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="mLength = 0";
__ref->__mlength /*int*/  = (int) (0);
B4IRDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _insert:(b4i_b4xbytesbuilder*) __ref :(int) _index :(B4IArray*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"insert"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"insert::" :@[@(_index),[B4I nilToNSNull:_data]]]);}
B4IArray* _afterindex = nil;
B4IRDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub Insert(Index As Int, Data() As Byte)";
B4IRDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref->__mlength /*int*/ ) { 
B4IRDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref->__mlength /*int*/ ) { 
[self->___c LogImpl:@"93276802" :@"Index too large" :0];};
B4IRDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Append(Data)";
[__ref _append /*b4i_b4xbytesbuilder**/ :nil :_data];
 }else {
B4IRDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Dim AfterIndex() As Byte = SubArray(Index)";
_afterindex = [__ref _subarray /*B4IArray**/ :nil :_index];
B4IRDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="ChangeLength(mLength + Data.Length)";
[__ref _changelength /*int*/ :nil :(int) (__ref->__mlength /*int*/ +_data.Length)];
B4IRDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
B4I_MEMCPY((_data)->internalBuffer + ((int) (0)), (__ref->__mbuffer /*B4IArray**/ )->internalBuffer + (_index),_data.Length);
B4IRDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Bit.ArrayCopy(AfterIndex, 0, mBuffer, Index + Da";
B4I_MEMCPY((_afterindex)->internalBuffer + ((int) (0)), (__ref->__mbuffer /*B4IArray**/ )->internalBuffer + ((int) (_index+_data.Length)),_afterindex.Length);
 };
B4IRDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="End Sub";
return @"";
}
- (B4IArray*)  _subarray:(b4i_b4xbytesbuilder*) __ref :(int) _beginindex{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"subarray"])
	 {return ((B4IArray*) [B4IDebug delegate:self.bi :@"subarray:" :@[@(_beginindex)]]);}
B4IRDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub SubArray(BeginIndex As Int) As Byte()";
B4IRDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Return SubArray2(BeginIndex, mLength)";
if (true) return [__ref _subarray2 /*B4IArray**/ :nil :_beginindex :__ref->__mlength /*int*/ ];
B4IRDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return nil;
}
- (B4IArray*)  _remove:(b4i_b4xbytesbuilder*) __ref :(int) _beginindex :(int) _endindex{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"remove"])
	 {return ((B4IArray*) [B4IDebug delegate:self.bi :@"remove::" :@[@(_beginindex),@(_endindex)]]);}
B4IArray* _res = nil;
B4IArray* _afterendindex = nil;
B4IRDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub Remove(BeginIndex As Int, EndIndex As I";
B4IRDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim res() As Byte = SubArray2(BeginIndex, EndInde";
_res = [__ref _subarray2 /*B4IArray**/ :nil :_beginindex :_endindex];
B4IRDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If EndIndex <= mLength Then";
if (_endindex<=__ref->__mlength /*int*/ ) { 
B4IRDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Dim AfterEndIndex() As Byte = SubArray(EndIndex)";
_afterendindex = [__ref _subarray /*B4IArray**/ :nil :_endindex];
B4IRDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Bit.ArrayCopy(AfterEndIndex, 0, mBuffer, BeginIn";
B4I_MEMCPY((_afterendindex)->internalBuffer + ((int) (0)), (__ref->__mbuffer /*B4IArray**/ )->internalBuffer + (_beginindex),_afterendindex.Length);
 };
B4IRDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="ChangeLength(mLength - (EndIndex - BeginIndex))";
[__ref _changelength /*int*/ :nil :(int) (__ref->__mlength /*int*/ -(_endindex-_beginindex))];
B4IRDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Return res";
if (true) return _res;
B4IRDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="End Sub";
return nil;
}
- (B4IArray*)  _subarray2:(b4i_b4xbytesbuilder*) __ref :(int) _beginindex :(int) _endindex{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"subarray2"])
	 {return ((B4IArray*) [B4IDebug delegate:self.bi :@"subarray2::" :@[@(_beginindex),@(_endindex)]]);}
B4IArray* _b = nil;
B4IRDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub SubArray2(BeginIndex As Int, EndIndex A";
B4IRDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim b(EndIndex - BeginIndex) As Byte";
_b = [[B4IArray alloc]initBytes:@[@((int) (_endindex-_beginindex))]];
B4IRDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Bit.ArrayCopy(mBuffer, BeginIndex, b, 0, b.Length";
B4I_MEMCPY((__ref->__mbuffer /*B4IArray**/ )->internalBuffer + (_beginindex), (_b)->internalBuffer + ((int) (0)),_b.Length);
B4IRDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Return b";
if (true) return _b;
B4IRDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _set:(b4i_b4xbytesbuilder*) __ref :(int) _index :(B4IArray*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"set"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"set::" :@[@(_index),[B4I nilToNSNull:_data]]]);}
B4IRDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub Set(Index As Int, Data() As Byte)";
B4IRDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref->__mlength /*int*/ ) { 
B4IRDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref->__mlength /*int*/ ) { 
[self->___c LogImpl:@"93342338" :@"Index too large" :0];};
B4IRDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Append(Data)";
[__ref _append /*b4i_b4xbytesbuilder**/ :nil :_data];
 }else {
B4IRDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="If Data.Length + Index > mLength Then";
if (_data.Length+_index>__ref->__mlength /*int*/ ) { 
B4IRDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="ChangeLength(Data.Length + Index)";
[__ref _changelength /*int*/ :nil :(int) (_data.Length+_index)];
 };
B4IRDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
B4I_MEMCPY((_data)->internalBuffer + ((int) (0)), (__ref->__mbuffer /*B4IArray**/ )->internalBuffer + (_index),_data.Length);
 };
B4IRDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="End Sub";
return @"";
}
- (B4IArray*)  _toarray:(b4i_b4xbytesbuilder*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbytesbuilder";
if ([B4IDebug shouldDelegate: @"toarray"])
	 {return ((B4IArray*) [B4IDebug delegate:self.bi :@"toarray" :nil]);}
B4IRDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub ToArray() As Byte()";
B4IRDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Return SubArray(0)";
if (true) return [__ref _subarray /*B4IArray**/ :nil :(int) (0)];
B4IRDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return nil;
}
@end