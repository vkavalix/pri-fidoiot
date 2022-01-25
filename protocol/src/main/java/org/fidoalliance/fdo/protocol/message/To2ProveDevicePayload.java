package org.fidoalliance.fdo.protocol.message;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.fidoalliance.fdo.protocol.serialization.GenericArraySerializer;

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder({"kexB"})
@JsonSerialize(using = GenericArraySerializer.class)
public class To2ProveDevicePayload {

  @JsonProperty("kexB")
  private byte[] kexB;

  @JsonIgnore
  public byte[] getKexB() {
    return kexB;
  }

  @JsonIgnore
  public void setKexB(byte[] kexB) {
    this.kexB = kexB;
  }
}
