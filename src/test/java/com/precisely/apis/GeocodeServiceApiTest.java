/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 18.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.GeocodeRequest;
import com.precisely.apis.model.GeocodeServiceResponse;
import com.precisely.apis.model.GeocodeServiceResponseList;
import com.precisely.apis.model.KeyLookupRequest;
import com.precisely.apis.model.PBKeyAddressRequest;
import com.precisely.apis.model.PBKeyResponse;
import com.precisely.apis.model.PBKeyResponseList;
import com.precisely.apis.model.ReverseGeocodeRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeocodeServiceApi
 */
@Ignore
public class GeocodeServiceApiTest {

    private final GeocodeServiceApi api = new GeocodeServiceApi();

    
    /**
     * Get Forward Geocode(Basic/Premium/Advanced)
     *
     * This service accepts an address and returns the location coordinates corresponding to that address. Premium offers the best accuracy and is a high precision geocoder leveraging Master Location Data - geocodes to Street or building level. Advanced offers advanced accuracy and geocodes to Street level.Basic offering will geocode to a Place or Postal level. Good accuracy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void geocodeTest() throws ApiException {
        String datapackBundle = null;
        String country = null;
        String mainAddress = null;
        String matchMode = null;
        String fallbackGeo = null;
        String fallbackPostal = null;
        String maxCands = null;
        String streetOffset = null;
        String streetOffsetUnits = null;
        String cornerOffset = null;
        String cornerOffsetUnits = null;
        String removeAccentMarks = null;
        String findDPV = null;
                GeocodeServiceResponse response = api.geocode(datapackBundle, country, mainAddress, matchMode, fallbackGeo, fallbackPostal, maxCands, streetOffset, streetOffsetUnits, cornerOffset, cornerOffsetUnits, removeAccentMarks, findDPV);
        // TODO: test validations
    }
    
    /**
     * Post Forward Geocode
     *
     * This is a Batch offering for geocode service. It accepts a single address or a list of addresses and returns location coordinates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void geocodeBatchTest() throws ApiException {
        String datapackBundle = null;
        GeocodeRequest geocodeRequest = null;
                GeocodeServiceResponseList response = api.geocodeBatch(datapackBundle, geocodeRequest);
        // TODO: test validations
    }
    
    /**
     * Get PreciselyID By Address
     *
     * This service accepts an address and returns the corresponding PreciselyID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPBKeyTest() throws ApiException {
        String address = null;
        String country = null;
                PBKeyResponse response = api.getPBKey(address, country);
        // TODO: test validations
    }
    
    /**
     * Post PreciselyID By Address
     *
     * This is a Batch offering for &#39;PreciselyID By Address&#39; service. It accepts a single address or a list of addresses and returns the corresponding PreciselyID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPBKeysTest() throws ApiException {
        PBKeyAddressRequest pbKeyAddressRequest = null;
                PBKeyResponseList response = api.getPBKeys(pbKeyAddressRequest);
        // TODO: test validations
    }
    
    /**
     * Get Key Lookup
     *
     * This service accepts a PreciselyID and returns the corresponding address associated with that PreciselyID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyLookupTest() throws ApiException {
        String key = null;
        String type = null;
        String country = null;
                GeocodeServiceResponse response = api.keyLookup(key, type, country);
        // TODO: test validations
    }
    
    /**
     * Post Key Lookup
     *
     * This service accepts batches of PreciselyID&#39;s and returns the corresponding address associated with those PreciselyID&#39;s.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyLookupBatchTest() throws ApiException {
        KeyLookupRequest keyLookupRequest = null;
                GeocodeServiceResponseList response = api.keyLookupBatch(keyLookupRequest);
        // TODO: test validations
    }
    
    /**
     * Post Reverse Geocode
     *
     * This is a Batch offering for geocode service. It accepts a single address or a list of addresses and returns location coordinates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reverseGeocodBatchTest() throws ApiException {
        String datapackBundle = null;
        ReverseGeocodeRequest reverseGeocodeRequest = null;
                GeocodeServiceResponseList response = api.reverseGeocodBatch(datapackBundle, reverseGeocodeRequest);
        // TODO: test validations
    }
    
    /**
     * Get Reverse Geocode(Basic/Premium/Advanced)
     *
     * This service accepts location coordinate and returns an address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reverseGeocodeTest() throws ApiException {
        String datapackBundle = null;
        String x = null;
        String y = null;
        String country = null;
        String coordSysName = null;
        String distance = null;
        String distanceUnits = null;
                GeocodeServiceResponse response = api.reverseGeocode(datapackBundle, x, y, country, coordSysName, distance, distanceUnits);
        // TODO: test validations
    }
    
}
