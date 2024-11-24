<!-- edit.blade.php -->
@extends('layouts.app')

@section('content')
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card">
                <div class="card-header">{{ __('スケジュール編集') }}</div>

                <div class="card-body">
                    <!-- バリデーションエラーメッセージ表示 -->
                    @if ($errors->any())
                        <div class="alert alert-danger">
                            <ul>
                                @foreach ($errors->all() as $error)
                                    <li>{{ $error }}</li>
                                @endforeach
                            </ul>
                        </div>
                    @endif

                    <!-- スケジュール更新フォーム -->
                    <form action="{{ route('schedules.update', $schedule->id) }}" method="POST" class="d-inline">
                        @csrf
                        @method('PUT') <!-- 更新メソッド指定 -->
                        
                        <div class="mb-3">
                            <label for="title" class="form-label">タイトル:</label>
                            <input type="text" class="form-control" name="title" value="{{ old('title', $schedule->title) }}" required>
                        </div>

                        <div class="mb-3">
                            <label for="description" class="form-label">説明:</label>
                            <textarea class="form-control" name="description">{{ old('description', $schedule->description) }}</textarea>
                        </div>

                        <div class="mb-3">
                            <label for="start_time" class="form-label">開始時間:</label>
                            <input type="datetime-local" class="form-control" name="start_time" value="{{ old('start_time', \Carbon\Carbon::parse($schedule->start_time)->format('Y-m-d\TH:i')) }}" required>
                        </div>

                        <div class="mb-3">
                            <label for="end_time" class="form-label">終了時間:</label>
                            <input type="datetime-local" class="form-control" name="end_time" value="{{ old('end_time', \Carbon\Carbon::parse($schedule->end_time)->format('Y-m-d\TH:i')) }}" required>
                        </div>

                        <!-- 更新ボタン -->
                        <button type="submit" class="btn btn-primary me-2">更新</button>
                    </form>

                    <!-- 削除フォーム -->
                    <form action="{{ route('schedules.destroy', $schedule->id) }}" method="POST" class="d-inline">
                        @csrf
                        @method('DELETE')
                        <button type="submit" class="btn btn-danger" onclick="return confirm('本当に削除しますか？')">削除</button>
                    </form>

                    <!-- 戻るボタン -->
                    <div class="mt-3">
                        <a href="{{ route('schedules.index') }}" class="btn btn-secondary me-2">戻る</a>
                        <a href="{{ route('dashboard') }}" class="btn btn-link">ダッシュボードへ戻る</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
@endsection



