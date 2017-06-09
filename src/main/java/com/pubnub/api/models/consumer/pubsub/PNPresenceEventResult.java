package com.pubnub.api.models.consumer.pubsub;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@ToString
public class PNPresenceEventResult {

    private String event;

    private String uuid;
    private Long timestamp;
    private Integer occupancy;
    private JsonNode state;

    @Deprecated
    private String subscribedChannel;
    @Deprecated
    private String actualChannel;

    private String channel;
    private String subscription;

    private Long timetoken;
    private Object userMetadata;
    private List<String> join;
    private List<String> leave;
    private List<String> timeout;
    private Boolean hereNowRefresh;

}
