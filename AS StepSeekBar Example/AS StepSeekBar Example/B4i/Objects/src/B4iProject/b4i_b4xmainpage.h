#import "iCore.h"
#import "iXUI.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class _asstepseekbar_step;
@class b4i_asstepseekbar;
@class b4i_b4xbitset;
@class b4i_b4xbytesbuilder;
@class _b4xcacheitem;
@class b4i_b4xcache;
@class b4i_b4xcomparatorsort;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xmainpage : B4IClass
{
@public B4XViewWrapper* __root;
@public B4IXUI* __xui;
@public b4i_asstepseekbar* __asstepseekbar1;
@public b4i_asstepseekbar* __asstepseekbar2;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _asstepseekbar1_valuechanged:(b4i_b4xmainpage*) __ref :(int) _index :(NSObject*) _value;
- (NSString*)  _asstepseekbar2_valuechanged:(b4i_b4xmainpage*) __ref :(int) _index :(NSObject*) _value;
- (void)  _b4xpage_created:(b4i_b4xmainpage*) __ref :(B4XViewWrapper*) _root1;
- (NSString*)  _class_globals:(b4i_b4xmainpage*) __ref;
@property (nonatomic)B4XViewWrapper* _root;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)b4i_asstepseekbar* _asstepseekbar1;
@property (nonatomic)b4i_asstepseekbar* _asstepseekbar2;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _initialize:(b4i_b4xmainpage*) __ref :(B4I*) _ba;
@end
