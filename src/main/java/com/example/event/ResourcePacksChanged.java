package com.example.event;

import java.util.List;
import lombok.Value;
import com.example.hub.ResourcePackManifest;

@Value
public class ResourcePacksChanged
{
	List<ResourcePackManifest> newManifest;
}
