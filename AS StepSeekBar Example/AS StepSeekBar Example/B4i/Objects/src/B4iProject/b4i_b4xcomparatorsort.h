#import "iCore.h"
#import "iXUI.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_b4xmainpage;
@class _asstepseekbar_step;
@class b4i_asstepseekbar;
@class b4i_b4xbitset;
@class b4i_b4xbytesbuilder;
@class _b4xcacheitem;
@class b4i_b4xcache;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xcomparatorsort : B4IClass
{
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _class_globals:(b4i_b4xcomparatorsort*) __ref;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _initialize:(b4i_b4xcomparatorsort*) __ref :(B4I*) _ba;
- (int)  _partition:(b4i_b4xcomparatorsort*) __ref :(B4IList*) _data :(int) _startindex :(int) _length :(int) _pivotindex :(NSObject*) _comparator;
- (NSString*)  _quicksort:(b4i_b4xcomparatorsort*) __ref :(B4IList*) _data :(int) _startindex :(int) _length :(NSObject*) _comparator;
- (NSString*)  _sort:(b4i_b4xcomparatorsort*) __ref :(B4IList*) _data :(NSObject*) _comparator;
- (NSString*)  _swap:(b4i_b4xcomparatorsort*) __ref :(B4IList*) _data :(int) _startindex :(int) _i1 :(int) _i2;
@end
