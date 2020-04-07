package com.ebube.aws.image.upload.bucket;

public enum BucketName {
    PROFILE_IMAGE("ebubecode-image-code-123");



    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
