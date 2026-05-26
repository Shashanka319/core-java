class GoogleRunner {
    public static void main(String[] args) {
        Google google = new Google(1, "Google Search", "Search", "C++", 4.5, 162.0, false, false, "1998-09-04", "Liz Reid", 4.8f, 15000, "Web", true, "Spanner", 10, 4.9, "Global Consumers", false, "PageRank");
        google.display();

        Google google1 = new Google(2, "Android OS", "Mobile", "Kotlin", 3.6, 0.0, true, false, "2008-09-23", "Sameer Samat", 4.5f, 8000, "Mobile", true, "SQLite", 12, 4.2, "Mobile Users", true, "Linux Kernel");
        google1.display();

        Google google2 = new Google(3, "Google Cloud", "Cloud", "Go", 0.08, 36.0, false, true, "2008-04-07", "Thomas Kurian", 4.6f, 25000, "Enterprise", true, "Bigtable", 15, 5.0, "Businesses", true, "Kubernetes");
        google2.display();

        Google google3 = new Google(4, "YouTube", "Video", "Python", 2.7, 31.5, false, false, "2005-02-14", "Neal Mohan", 4.7f, 10000, "Cross-platform", true, "Vitess", 9, 4.1, "Global Viewers", true, "Google VRP");
        google3.display();

        Google google4 = new Google(5, "Gmail", "Mail", "Java", 1.8, 0.0, false, false, "2004-04-01", "P. Raghavan", 4.4f, 4000, "Web/Mobile", true, "Spanner", 11, 4.5, "Personal/Work", true, "Colossus");
        google4.display();

        Google google5 = new Google(6, "Google Maps", "Navigation", "C++", 1.2, 5.0, false, false, "2005-02-08", "C. Phillips", 4.8f, 6000, "Mobile", true, "Bigtable", 8, 4.3, "Travelers", true, "Cartography");
        google5.display();

        Google google6 = new Google(7, "Chrome", "Browser", "C++", 3.3, 0.0, true, false, "2008-09-02", "Parisa Tabriz", 4.6f, 3000, "Desktop", true, "LevelDB", 14, 4.0, "Web Users", true, "V8 Engine");
        google6.display();

        Google google7 = new Google(8, "Pixel 9 Pro", "Hardware", "C++", 0.03, 12.0, false, true, "2024-08-13", "Rick Osterloh", 4.7f, 5000, "Android", true, "Flash", 10, 4.6, "Tech Enthusiasts", true, "Tensor G4");
        google7.display();

        Google google8 = new Google(9, "Flutter", "DevTools", "Dart", 0.005, 0.0, true, false, "2017-05-12", "Tim Sneath", 4.9f, 500, "Cross-platform", false, "Internal", 7, 4.8, "Developers", true, "Skia");
        google8.display();

        Google google9 = new Google(10, "Google Ads", "Ads", "Java", 0.01, 237.0, false, true, "2000-10-23", "Jerry Dischler", 4.3f, 12000, "Web", true, "F1", 15, 4.7, "Advertisers", false, "Mesa");
        google9.display();
    }
}