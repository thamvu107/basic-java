package src.lessons.Lesson_12.constantPool.WithoutImplementInterface;

import src.lessons.Lesson_12.constantPool.ImplementInterface.IUrlSlug;

public class EnvWithoutImplementInterface {
    public static void main(String[] args) {

        System.out.println(UrlSlug.QA_ENV);
        System.out.println(UrlSlug.STAGING_ENV);

        System.out.println(UrlSlug.getQaUrl());
        System.out.println(UrlSlug.getStagingUrl());
    }

}
