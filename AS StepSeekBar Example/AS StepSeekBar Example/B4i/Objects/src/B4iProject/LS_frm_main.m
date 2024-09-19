
#import "iCore.h"
@interface LS_frm_main:NSObject
@end

@implementation LS_frm_main

- (void)LS_general:(B4I*)bi :(UIView*)parent :(B4ILayoutValues*)lv :(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[frm_main/General script]
[B4ILayoutBuilder scaleAll:views :width :height];

}
@end