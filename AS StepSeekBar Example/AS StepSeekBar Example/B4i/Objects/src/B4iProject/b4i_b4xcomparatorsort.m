
#import "b4i_b4xcomparatorsort.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_asstepseekbar.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcache.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xcomparatorsort 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xcomparatorsort) instance released.");
}

- (NSString*)  _class_globals:(b4i_b4xcomparatorsort*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xcomparatorsort";
B4IRDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xcomparatorsort*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xcomparatorsort";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="End Sub";
return @"";
}
- (int)  _partition:(b4i_b4xcomparatorsort*) __ref :(B4IList*) _data :(int) _startindex :(int) _length :(int) _pivotindex :(NSObject*) _comparator{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcomparatorsort";
if ([B4IDebug shouldDelegate: @"partition"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"partition:::::" :@[[B4I nilToNSNull:_data],@(_startindex),@(_length),@(_pivotindex),[B4I nilToNSNull:_comparator]]]).intValue;}
NSObject* _pivotvalue = nil;
int _l = 0;
int _i = 0;
B4IRDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub Partition(Data As List, StartIndex As";
B4IRDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim PivotValue As Object = Data.Get(StartIndex +";
_pivotvalue = [_data Get:(int) (_startindex+_pivotindex)];
B4IRDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Swap(Data, StartIndex, PivotIndex, Length - 1)";
[__ref _swap /*NSString**/ :nil :_data :_startindex :_pivotindex :(int) (_length-1)];
B4IRDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Dim L As Int = 0";
_l = (int) (0);
B4IRDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="For i = 0 To Length - 2";
{
const int step4 = 1;
const int limit4 = (int) (_length-2);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
B4IRDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="If CallSub3(Comparator, \"Compare\", Data.Get(Star";
if (([self.bi ObjectToNumber:[self->___c CallSubDebug3:self.bi :_comparator :@"Compare" :[_data Get:(int) (_startindex+_i)] :_pivotvalue]].intValue)<0) { 
B4IRDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="L = L + 1";
_l = (int) (_l+1);
B4IRDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="Swap(Data, StartIndex, L - 1, i)";
[__ref _swap /*NSString**/ :nil :_data :_startindex :(int) (_l-1) :_i];
 };
 }
};
B4IRDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="Swap(Data, StartIndex, Length - 1, L)";
[__ref _swap /*NSString**/ :nil :_data :_startindex :(int) (_length-1) :_l];
B4IRDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="Return L";
if (true) return _l;
B4IRDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _swap:(b4i_b4xcomparatorsort*) __ref :(B4IList*) _data :(int) _startindex :(int) _i1 :(int) _i2{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcomparatorsort";
if ([B4IDebug shouldDelegate: @"swap"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"swap::::" :@[[B4I nilToNSNull:_data],@(_startindex),@(_i1),@(_i2)]]);}
NSObject* _o = nil;
B4IRDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub Swap (Data As List, StartIndex As Int,";
B4IRDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim o As Object = Data.Get(StartIndex + i1)";
_o = [_data Get:(int) (_startindex+_i1)];
B4IRDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Data.Set(StartIndex + i1, Data.Get(StartIndex + i";
[_data Set:(int) (_startindex+_i1) :[_data Get:(int) (_startindex+_i2)]];
B4IRDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Data.Set(StartIndex + i2, o)";
[_data Set:(int) (_startindex+_i2) :_o];
B4IRDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _quicksort:(b4i_b4xcomparatorsort*) __ref :(B4IList*) _data :(int) _startindex :(int) _length :(NSObject*) _comparator{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcomparatorsort";
if ([B4IDebug shouldDelegate: @"quicksort"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"quicksort::::" :@[[B4I nilToNSNull:_data],@(_startindex),@(_length),[B4I nilToNSNull:_comparator]]]);}
int _pivotindex = 0;
int _r = 0;
B4IRDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub QuickSort (Data As List, StartIndex As";
B4IRDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="If Length > 1 Then";
if (_length>1) { 
B4IRDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim PivotIndex As Int = Rnd(0, Length)";
_pivotindex = [self->___c Rnd:(int) (0) :_length];
B4IRDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Dim r As Int = Partition(Data, StartIndex, Lengt";
_r = [__ref _partition /*int*/ :nil :_data :_startindex :_length :_pivotindex :_comparator];
B4IRDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="QuickSort(Data, StartIndex, r, Comparator)";
[__ref _quicksort /*NSString**/ :nil :_data :_startindex :_r :_comparator];
B4IRDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="QuickSort(Data, StartIndex + r + 1, Length - r -";
[__ref _quicksort /*NSString**/ :nil :_data :(int) (_startindex+_r+1) :(int) (_length-_r-1) :_comparator];
 };
B4IRDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _sort:(b4i_b4xcomparatorsort*) __ref :(B4IList*) _data :(NSObject*) _comparator{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcomparatorsort";
if ([B4IDebug shouldDelegate: @"sort"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"sort::" :@[[B4I nilToNSNull:_data],[B4I nilToNSNull:_comparator]]]);}
B4IRDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub Sort (Data As List, Comparator As Objec";
B4IRDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="QuickSort(Data, 0, Data.Size, Comparator)";
[__ref _quicksort /*NSString**/ :nil :_data :(int) (0) :[_data Size] :_comparator];
B4IRDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="End Sub";
return @"";
}
@end