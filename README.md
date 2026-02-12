# BLE/UWB Radius Detection Platform

## Overview
A proximity-based system for location-aware interactions using BLE and optionally UWB. The goal is to allow devices (phones or custom beacons) to automatically detect when a user enters a room/area and trigger context-relevant actions.

This project is an experimental platform combining hardware (BLE/UWB beacons), a mobile application, and backend infrastructure.

---

## Key Features
- **Phone as Broadcaster**: Users can enable broadcasting on their phone; nearby beacons detect signals.
- **Beacon Detection**: Beacons pick up device tokens and send them to a backend server.
- **Server Coordination**: Backend matches detected tokens to active users and sends event/location data back to the app.
- **Event Notification**: Users can receive notifications or in-app updates related to the space they entered (e.g., conference room info, museum exhibit info).
- **Fallback & Future Scope**:
  - BLE for universal compatibility.
  - Optional UWB for precise indoor localization.
  - Analytics: track room traffic, duration, and repeated visits.
  
---

## Architecture
1. **Mobile App**
   - Foreground service enabling BLE broadcasting or scanning.
   - Receives UUIDs from beacons and queries backend for context data.
   - Lightweight UI for notifications and event display.

2. **Beacons**
   - Constantly scan for active broadcasts.
   - Forward detected UUIDs to backend with beacon location.

3. **Backend**
   - REST API for UUID matching and event delivery.
   - Stores beacon registration, user tokens, and event mapping.

---

## Getting Started
- Requires BLE-capable phone for testing.
- Optional: BLE dongle for beacon simulation.
- Setup backend (FastAPI / Node / Python Flask) with endpoints for:
  - `/register_beacon`
  - `/detect_token`
  - `/get_event_data`

---

## Notes
- OS limitations require phones to actively broadcast (foreground service) or use OS-supported region monitoring for scanning.
- BLE used for compatibility; UWB can be adopted for newer devices requiring precise distance tracking.
- Focus on experimental use-cases: museums, offices, conferences, or asset tracking inside buildings.
