package com.example;


import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyClass {

    public static void  main(String[] args) {


        Schema schema = new Schema(1, "com.example.administrator.fmxima.entities");
        schema.setDefaultJavaPackageDao("com.example.administrator.fmxima.dao");


        //发现类
        Entity discoverEntity = schema.addEntity("DiscoverEntity");
        discoverEntity.addIdProperty();
        discoverEntity.addStringProperty("orderNum");
        discoverEntity.addStringProperty("title");
        discoverEntity.addStringProperty("subtitle");
        discoverEntity.addStringProperty("coverPath");
        discoverEntity.addStringProperty("contentType");
        discoverEntity.addStringProperty("url");
        discoverEntity.addStringProperty("sharePic");
        discoverEntity.addBooleanProperty("enableShare");
        discoverEntity.addBooleanProperty("isHot");
        discoverEntity.addBooleanProperty("isExternalUrl");
        discoverEntity.addStringProperty("contentUpdatedAt");

        //热门推荐的类
        final Entity RecommendsEntity = schema.addEntity("RecommendsEntity");
        RecommendsEntity.addStringProperty("title");
        RecommendsEntity.addStringProperty("contentType");
        RecommendsEntity.addBooleanProperty("isFinished");
        RecommendsEntity.addStringProperty("categoryId");
        RecommendsEntity.addIntProperty("count");
        RecommendsEntity.addBooleanProperty("hasMore");


        //音乐专辑的类
        final Entity albumEntity = schema.addEntity("AlbumEntity");
        albumEntity.addLongProperty("albumId").primaryKey();
        albumEntity.addIntProperty("categoryId");
        albumEntity.addStringProperty("categoryName");
        albumEntity.addStringProperty("title");
        albumEntity.addStringProperty("coverOrigin");
        albumEntity.addStringProperty("coverSmall");
        albumEntity.addStringProperty("coverMiddle");
        albumEntity.addStringProperty("coverLarge");
        albumEntity.addStringProperty("coverWebLarge");
        albumEntity.addDateProperty("createdAt");
        albumEntity.addDateProperty("updatedAt");
        albumEntity.addLongProperty("uid");
        albumEntity.addStringProperty("nickname");
        albumEntity.addBooleanProperty("isVerified");
        albumEntity.addStringProperty("avatarPath");
        albumEntity.addStringProperty("zoneId");
        albumEntity.addStringProperty("intro");
        albumEntity.addStringProperty("introRich");
        albumEntity.addStringProperty("tags");
        albumEntity.addStringProperty("tracks");
        albumEntity.addStringProperty("shares");
        albumEntity.addBooleanProperty("hasNew");
        albumEntity.addBooleanProperty("isFavorite");
        albumEntity.addStringProperty("playTimes");
        albumEntity.addStringProperty("status");
        albumEntity.addStringProperty("serializeStatus");
        albumEntity.addStringProperty("serialState");
        albumEntity.addStringProperty("playTrackId");
        albumEntity.addBooleanProperty("isRecordDesc");


        //视听的类
        Entity trackEntity = schema.addEntity("TrackEntity");

        trackEntity.addLongProperty("trackId").primaryKey();
        trackEntity.addLongProperty("uid");
        trackEntity.addStringProperty("playUrl64");
        trackEntity.addStringProperty("playUrl32");
        trackEntity.addStringProperty("downloadUrl");
        trackEntity.addStringProperty("playPathAacv164");
        trackEntity.addStringProperty("playPathAacv224");
        trackEntity.addStringProperty("downloadAacUrl");
        trackEntity.addStringProperty("title");
        trackEntity.addStringProperty("duration");
        trackEntity.addStringProperty("albumId");
        trackEntity.addStringProperty("albumTitle");
        trackEntity.addStringProperty("albumImage");
        trackEntity.addStringProperty("processState");
        trackEntity.addStringProperty("createdAt");
        trackEntity.addStringProperty("coverSmall");
        trackEntity.addStringProperty("coverMiddle");
        trackEntity.addStringProperty("coverLarge");
        trackEntity.addStringProperty("nickname");
        trackEntity.addStringProperty("smallLogo");
        trackEntity.addStringProperty("userSource");
        trackEntity.addStringProperty("orderNum");
        trackEntity.addStringProperty("opType");
        trackEntity.addBooleanProperty("isPublic");
        trackEntity.addStringProperty("likes");
        trackEntity.addStringProperty("playtimes");
        trackEntity.addStringProperty("comments");
        trackEntity.addStringProperty("shares");
        trackEntity.addStringProperty("status");
        trackEntity.addStringProperty("downloadSize");
        trackEntity.addStringProperty("downloadAacSize");

        //trackEntity.addStringProperty("commentsCounts");

        //focusImage:
        Entity focusImageEntity = schema.addEntity("FocusImageEntity");
        focusImageEntity.addIdProperty();
        focusImageEntity.addStringProperty("shortTitle");
        focusImageEntity.addStringProperty("longTitle");
        focusImageEntity.addStringProperty("pic");
        focusImageEntity.addStringProperty("type");
        focusImageEntity.addStringProperty("uid");
        focusImageEntity.addStringProperty("trackId");
        focusImageEntity.addStringProperty("isShare");
        focusImageEntity.addStringProperty("is_External_url");


/*        //弹幕
        Entity bulletAreaEntity = schema.addEntity("BulletAreaEntity");

        bulletAreaEntity.addLongProperty("trackId").primaryKey();
        bulletAreaEntity.addStringProperty("title");
        bulletAreaEntity.addStringProperty("coverMiddle");
        bulletAreaEntity.addStringProperty("tags");
        bulletAreaEntity.addStringProperty("playPath32");
        bulletAreaEntity.addStringProperty("playPath64");
        bulletAreaEntity.addStringProperty("albumId");
        bulletAreaEntity.addStringProperty("albumTitle");
        bulletAreaEntity.addStringProperty("favoritesCounts");
        bulletAreaEntity.addStringProperty("playsCounts");
        bulletAreaEntity.addStringProperty("commentsCounts");
        bulletAreaEntity.addStringProperty("sharesCounts");*/

        //精品听单；
        Entity specialColumnEntity = schema.addEntity("SpecialColumnEntity");

        specialColumnEntity.addStringProperty("columnType");
        specialColumnEntity.addStringProperty("specialId");
        specialColumnEntity.addStringProperty("title");
        specialColumnEntity.addStringProperty("subtitle");
        specialColumnEntity.addStringProperty("footnote");
        specialColumnEntity.addStringProperty("coverPath");
        specialColumnEntity.addStringProperty("contentType");

        try {
           new DaoGenerator().generateAll(schema, "lib/java-gen");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}