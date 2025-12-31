package com.back.shard.member.event;

import com.back.shard.member.dto.MemberDto;
import com.back.standard.event.HasEventName;

public record MemberJoinedEvent(
        MemberDto member
) implements HasEventName {
}
