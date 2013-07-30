/*
 * Copyright (C) 2013 Google Inc.
 * Licensed to The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.mail.ui;

import com.google.common.collect.Lists;

import android.content.Context;
import android.view.LayoutInflater;

import com.android.mail.providers.Account;

import com.android.mail.R;

import java.util.ArrayList;

public class ConversationListHelper {
    /**
     * Creates a list of newly created special views.
     */
    public ArrayList<ConversationSpecialItemView> makeConversationListSpecialViews(
            final Context context, final ControllableActivity activity, final Account account) {
        // Conversation photo teaser view
        final ConversationPhotoTeaserView conversationPhotoTeaser =
                (ConversationPhotoTeaserView) LayoutInflater.from(context)
                        .inflate(R.layout.conversation_photo_teaser_view, null);


        // Long press to select tip
        final ConversationLongPressTipView conversationLongPressTipView =
                (ConversationLongPressTipView) LayoutInflater.from(context)
                        .inflate(R.layout.conversation_long_press_to_select_tip_view, null);

        final ArrayList<ConversationSpecialItemView> itemViews = Lists.newArrayList();
        itemViews.add(conversationPhotoTeaser);
        itemViews.add(conversationLongPressTipView);
        return itemViews;
    }
}
