package com.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.widgets.WidgetInfo;
import static com.example.WidgetResize.Group.*;
import static com.example.WidgetResize.Children.*;

@Getter
@RequiredArgsConstructor
public enum WidgetResize
{


	RESIZABLE_QUESTS_TAB(WidgetInfo.RESIZABLE_VIEWPORT_QUESTS_TAB.getGroupId(), new Integer[] {WidgetInfo.RESIZABLE_VIEWPORT_QUESTS_TAB.getChildId()}, null, null, null, null, 33, null, 38, null, null),
	RESIZABLE_IGNORES_TAB(WidgetInfo.RESIZABLE_VIEWPORT_IGNORES_TAB.getGroupId(), new Integer[] {WidgetInfo.RESIZABLE_VIEWPORT_IGNORES_TAB.getChildId()}, null, null, null, null, 33, null, 38, null, null),
	FIXED_QUESTS_TAB(WidgetInfo.FIXED_VIEWPORT_QUESTS_TAB.getGroupId(), new Integer[] {WidgetInfo.FIXED_VIEWPORT_QUESTS_TAB.getChildId()}, null, null, null, null, 33, null, 38, null, null),
	FIXED_IGNORES_TAB(WidgetInfo.FIXED_VIEWPORT_IGNORES_TAB.getGroupId(), new Integer[] {WidgetInfo.FIXED_VIEWPORT_IGNORES_TAB.getChildId()},  null, null, null, null, 33, null, 38, null, null),

	FAIRY_RING_SEARCH_ICON(WidgetInfo.FAIRY_RING_HEADER.getGroupId(), new Integer[] {2}, null, null, null, null, 20, 18, 20, 18, 8),

	GRAND_EXCHANGE_OFFER_BORDER_LEFT(WidgetInfo.GRAND_EXCHANGE_WINDOW_CONTAINER.getGroupId(), GRAND_EXCHANGE_OFFER_BORDER_LEFT_CHILDREN_IDS, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_COLLECTION_BOX_BORDER_LEFT(GRAND_EXCHANGE_COLLECTION_BOX_GROUP, GRAND_EXCHANGE_COLLECTION_BOX_BORDER_LEFT_CHILDREN_IDS, -13, null, -14, null, null, null, null, null, 7),

	;

	private final Integer group;
	private final Integer[] child;
	private final Integer modifiedX;
	private final Integer modifiedY;
	private final Integer originalX;
	private final Integer originalY;
	private final Integer modifiedWidth;
	private final Integer modifiedHeight;
	private final Integer originalWidth;
	private final Integer originalHeight;
	private final Integer childIndex;

	static class Group {
		static final Integer GRAND_EXCHANGE_COLLECTION_BOX_GROUP = 402;
	}

	static class Children {

		static final Integer[] GRAND_EXCHANGE_OFFER_BORDER_LEFT_CHILDREN_IDS = {
				7, 8, 9, 10, 11, 12, 13, 14
		};
		static final Integer[] GRAND_EXCHANGE_COLLECTION_BOX_BORDER_LEFT_CHILDREN_IDS = {
				5, 6, 7, 8, 9, 10, 11, 12
		};

	}

}
