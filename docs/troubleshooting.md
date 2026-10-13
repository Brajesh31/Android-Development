# Troubleshooting

## Gradle sync fails

Verify SDK 34 and a compatible JDK are installed, then retry Gradle sync. Use the repository wrapper instead of a globally installed Gradle version.

## App does not launch

Check the selected run configuration, manifest launcher filters, device API level, and Logcat for the first exception. Multiple launcher activities are currently intentional learning artifacts.

## Camera screen fails

Check device camera availability, runtime permission handling, and whether an activity can resolve the camera intent. Test on a real device as well as an emulator.

## Resources are missing

Use lowercase resource names, clean/rebuild after resource changes, and check references in layouts, manifest, and Kotlin code.
