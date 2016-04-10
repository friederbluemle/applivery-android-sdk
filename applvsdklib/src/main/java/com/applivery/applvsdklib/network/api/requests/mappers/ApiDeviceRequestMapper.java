/*
 * Copyright (c) 2016 Applivery
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.applivery.applvsdklib.network.api.requests.mappers;

import com.applivery.applvsdklib.domain.model.FeedbackWrapper;
import com.applivery.applvsdklib.network.api.model.ApiDeviceData;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 10/4/16.
 */
public class ApiDeviceRequestMapper implements RequestMapper<FeedbackWrapper, ApiDeviceData>{

  @Override public ApiDeviceData modelToData(FeedbackWrapper feedbackWrapper) {

    String model = feedbackWrapper.getModel();
    String vendor = feedbackWrapper.getVendor();
    String type = feedbackWrapper.getType();

    return new ApiDeviceData(model,vendor, type);
  }

}
