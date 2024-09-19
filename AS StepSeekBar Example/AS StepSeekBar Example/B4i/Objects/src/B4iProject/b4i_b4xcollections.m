
#import "b4i_b4xcollections.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_asstepseekbar.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcache.h"
#import "b4i_b4xcomparatorsort.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xcollections 


+ (instancetype)new {
    static b4i_b4xcollections* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 9;
}


- (b4i_b4xbitset*)  _createbitset:(int) _size{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createbitset"])
	 {return ((b4i_b4xbitset*) [B4IDebug delegate:self.bi :@"createbitset:" :@[@(_size)]]);}
b4i_b4xbitset* _s = nil;
B4IRDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
B4IRDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim s As B4XBitSet";
_s = [b4i_b4xbitset new];
B4IRDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="s.Initialize(Size)";
[_s _initialize /*NSString**/ :nil :self.bi :_size];
B4IRDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="Return s";
if (true) return _s;
B4IRDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xorderedmap*)  _createorderedmap{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createorderedmap"])
	 {return ((b4i_b4xorderedmap*) [B4IDebug delegate:self.bi :@"createorderedmap" :nil]);}
B4IRDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
B4IRDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return [self _createorderedmap2:(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(nil)] :(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(nil)]];
B4IRDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xorderedmap*)  _createorderedmap2:(B4IList*) _keys :(B4IList*) _values{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createorderedmap2"])
	 {return ((b4i_b4xorderedmap*) [B4IDebug delegate:self.bi :@"createorderedmap2::" :@[[B4I nilToNSNull:_keys],[B4I nilToNSNull:_values]]]);}
b4i_b4xorderedmap* _m = nil;
int _i = 0;
B4IRDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
B4IRDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim m As B4XOrderedMap";
_m = [b4i_b4xorderedmap new];
B4IRDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="m.Initialize";
[_m _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= nil && _values!= nil && [_keys IsInitialized] && [_values IsInitialized]) { 
B4IRDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="For i = 0 To Keys.Size - 1";
{
const int step4 = 1;
const int limit4 = (int) ([_keys Size]-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
B4IRDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
[_m _put /*NSString**/ :nil :[_keys Get:_i] :[_values Get:_i]];
 }
};
 };
B4IRDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="Return m";
if (true) return _m;
B4IRDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xset*)  _createset{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createset"])
	 {return ((b4i_b4xset*) [B4IDebug delegate:self.bi :@"createset" :nil]);}
B4IRDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub CreateSet As B4XSet";
B4IRDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Return CreateSet2(Null)";
if (true) return [self _createset2:(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(nil)]];
B4IRDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xset*)  _createset2:(B4IList*) _values{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createset2"])
	 {return ((b4i_b4xset*) [B4IDebug delegate:self.bi :@"createset2:" :@[[B4I nilToNSNull:_values]]]);}
b4i_b4xset* _s = nil;
NSObject* _v = nil;
B4IRDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
B4IRDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim s As B4XSet";
_s = [b4i_b4xset new];
B4IRDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="s.Initialize";
[_s _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= nil && [_values IsInitialized]) { 
B4IRDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="For Each v As Object In Values";
{
const id<B4IIterable> group4 = _values;
const int groupLen4 = group4.Size
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = [group4 Get:index4];
B4IRDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="s.Add(v)";
[_s _add /*NSString**/ :nil :_v];
 }
};
 };
B4IRDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="Return s";
if (true) return _s;
B4IRDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return @"";
}
@end