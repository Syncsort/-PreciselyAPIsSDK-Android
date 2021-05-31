/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.5.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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


package com.precisely.apis;

import com.precisely.ApiCallback;
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.ApiResponse;
import com.precisely.Configuration;
import com.precisely.Pair;
import com.precisely.ProgressRequestBody;
import com.precisely.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.precisely.apis.model.SchoolsNearByResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolsServiceApi {
    private ApiClient apiClient;

    public SchoolsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SchoolsServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getSchoolsByAddress */
    private com.squareup.okhttp.Call getSchoolsByAddressCall(String address, String edLevel, String schoolType, String schoolSubType, String gender, String assignedSchoolsOnly, String districtSchoolsOnly, String searchRadius, String searchRadiusUnit, String travelTime, String travelTimeUnit, String travelDistance, String travelDistanceUnit, String travelMode, String maxCandidates, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getSchoolsByAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/schools/v1/school/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
        if (edLevel != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "edLevel", edLevel));
        if (schoolType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "schoolType", schoolType));
        if (schoolSubType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "schoolSubType", schoolSubType));
        if (gender != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
        if (assignedSchoolsOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "assignedSchoolsOnly", assignedSchoolsOnly));
        if (districtSchoolsOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "districtSchoolsOnly", districtSchoolsOnly));
        if (searchRadius != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchRadius", searchRadius));
        if (searchRadiusUnit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchRadiusUnit", searchRadiusUnit));
        if (travelTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "travelTime", travelTime));
        if (travelTimeUnit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "travelTimeUnit", travelTimeUnit));
        if (travelDistance != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "travelDistance", travelDistance));
        if (travelDistanceUnit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "travelDistanceUnit", travelDistanceUnit));
        if (travelMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "travelMode", travelMode));
        if (maxCandidates != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCandidates", maxCandidates));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Search Nearby Schools by Address
     * Search Nearby Schools by Address
     * @param address free form address text (required)
     * @param edLevel Single digit code for education level applicable values are P -&gt; primary, M -&gt; Middle, H -&gt; High, O -&gt; Mixed Grades for public school type andE -&gt; Elementary , S -&gt; Secondary , O -&gt; Others mixed grades for private schools  (optional)
     * @param schoolType Single digit code for schoolTypes applicable values are PRI and PUB (optional)
     * @param schoolSubType Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education) (optional)
     * @param gender Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males) (optional)
     * @param assignedSchoolsOnly Single digit code for assignedSchoolOnly applicable values are  Y/N  (optional)
     * @param districtSchoolsOnly Single digit code for districtSchoolOnly applicable values are Y/N  (optional)
     * @param searchRadius Search Radius within which schools are searched (optional)
     * @param searchRadiusUnit Search Radius unit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelTime Travel Time based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelTimeUnit Travel Time unit applicable values are minutes,hours,seconds,milliseconds  (optional)
     * @param travelDistance Travel Distance based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelDistanceUnit Travel distanceUnit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelMode Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving (optional)
     * @param maxCandidates Max result to search  (optional, default to 10)
     * @return SchoolsNearByResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SchoolsNearByResponse getSchoolsByAddress(String address, String edLevel, String schoolType, String schoolSubType, String gender, String assignedSchoolsOnly, String districtSchoolsOnly, String searchRadius, String searchRadiusUnit, String travelTime, String travelTimeUnit, String travelDistance, String travelDistanceUnit, String travelMode, String maxCandidates) throws ApiException {
        ApiResponse<SchoolsNearByResponse> resp = getSchoolsByAddressWithHttpInfo(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates);
        return resp.getData();
    }

    /**
     * Search Nearby Schools by Address
     * Search Nearby Schools by Address
     * @param address free form address text (required)
     * @param edLevel Single digit code for education level applicable values are P -&gt; primary, M -&gt; Middle, H -&gt; High, O -&gt; Mixed Grades for public school type andE -&gt; Elementary , S -&gt; Secondary , O -&gt; Others mixed grades for private schools  (optional)
     * @param schoolType Single digit code for schoolTypes applicable values are PRI and PUB (optional)
     * @param schoolSubType Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education) (optional)
     * @param gender Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males) (optional)
     * @param assignedSchoolsOnly Single digit code for assignedSchoolOnly applicable values are  Y/N  (optional)
     * @param districtSchoolsOnly Single digit code for districtSchoolOnly applicable values are Y/N  (optional)
     * @param searchRadius Search Radius within which schools are searched (optional)
     * @param searchRadiusUnit Search Radius unit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelTime Travel Time based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelTimeUnit Travel Time unit applicable values are minutes,hours,seconds,milliseconds  (optional)
     * @param travelDistance Travel Distance based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelDistanceUnit Travel distanceUnit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelMode Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving (optional)
     * @param maxCandidates Max result to search  (optional, default to 10)
     * @return ApiResponse&lt;SchoolsNearByResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SchoolsNearByResponse> getSchoolsByAddressWithHttpInfo(String address, String edLevel, String schoolType, String schoolSubType, String gender, String assignedSchoolsOnly, String districtSchoolsOnly, String searchRadius, String searchRadiusUnit, String travelTime, String travelTimeUnit, String travelDistance, String travelDistanceUnit, String travelMode, String maxCandidates) throws ApiException {
        com.squareup.okhttp.Call call = getSchoolsByAddressCall(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates, null, null);
        Type localVarReturnType = new TypeToken<SchoolsNearByResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Nearby Schools by Address (asynchronously)
     * Search Nearby Schools by Address
     * @param address free form address text (required)
     * @param edLevel Single digit code for education level applicable values are P -&gt; primary, M -&gt; Middle, H -&gt; High, O -&gt; Mixed Grades for public school type andE -&gt; Elementary , S -&gt; Secondary , O -&gt; Others mixed grades for private schools  (optional)
     * @param schoolType Single digit code for schoolTypes applicable values are PRI and PUB (optional)
     * @param schoolSubType Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education) (optional)
     * @param gender Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males) (optional)
     * @param assignedSchoolsOnly Single digit code for assignedSchoolOnly applicable values are  Y/N  (optional)
     * @param districtSchoolsOnly Single digit code for districtSchoolOnly applicable values are Y/N  (optional)
     * @param searchRadius Search Radius within which schools are searched (optional)
     * @param searchRadiusUnit Search Radius unit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelTime Travel Time based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelTimeUnit Travel Time unit applicable values are minutes,hours,seconds,milliseconds  (optional)
     * @param travelDistance Travel Distance based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelDistanceUnit Travel distanceUnit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelMode Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving (optional)
     * @param maxCandidates Max result to search  (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSchoolsByAddressAsync(String address, String edLevel, String schoolType, String schoolSubType, String gender, String assignedSchoolsOnly, String districtSchoolsOnly, String searchRadius, String searchRadiusUnit, String travelTime, String travelTimeUnit, String travelDistance, String travelDistanceUnit, String travelMode, String maxCandidates, final ApiCallback<SchoolsNearByResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSchoolsByAddressCall(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SchoolsNearByResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
